import java.util.Random;

public class T3ControllerGame
{
    private int[][] brick; //Spielfeld 0 = kein block, 1-7 = blöcke in verschiedenen farben
    private int[][] nextStoneBrick;
    private int points;
    private int clearedLines;
    private int level;
    private int tickInterval;
    private int freezeDelay;
    private boolean freezeDelayOn;
    private int[] moveBrickX;  // 0 = gleichzeitig Drehzentrum
    private int[] moveBrickY;  // 0 = gleichzeitig Drehzentrum
    private int[] availableStoneTypes;
    private int nextStoneId;
    private T3Clock clock;
    
    public T3ControllerGame()
    {
        
        brick = new int[10][24];
        for(int x = 0; x < 10; x++)
        {
            for(int y = 0; y < 24; y++)
            {
                brick[x][y] = 0;
            }
        }
        
        nextStoneBrick = new int[3][4];
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 4; y++)
            {
                nextStoneBrick[x][y] = 0;
            }
        }
        points = 0;
        level = 0;
        tickInterval = 600; //später raus
        //tickInterval = model.config.game.tickIntervalForLevel(level);
        freezeDelay = 2000; //später raus
        //freezeDelay = model.config.game.freezeDelay();      <--- model sagen
        clock = new T3Clock(this);
        availableStoneTypes = new int[7];
        //availableStoneTypes[] = model.config.game.availableStoneTypes();    <--- irgentwie anders
        for(int i = 0; i < 7; i++) //später raus
        {
            availableStoneTypes[i] = i + 1;
        }
        moveBrickX = new int[4];
        moveBrickY = new int[4];
        for(int i = 0; i < 4; i++)
        {
            moveBrickX[i] = 0;
            moveBrickY[i] = 0;
        }
        refresh();
    }
    
    public void newGame()
    {
        points = 0;
        level = 0;
        freezeDelayOn = false;
        Random r = new Random();
        nextStoneId = availableStoneTypes[r.nextInt(7)];
        newStone();
        clock.newGame(tickInterval);
    }
    
    
    
    private void newStone()
    {
        int stoneId;
        stoneId = nextStoneId;
        int random;
        Random r = new Random();
        nextStoneId = 0;
        while (nextStoneId == 0)
        {
            nextStoneId = availableStoneTypes[r.nextInt(7)];
        }
        showNextStone();
        
        setMoveBrickForNewStone(stoneId);                
        for (int i = 0; i < 4; i++)
        {
            setBrick(moveBrickX[i], moveBrickY[i], stoneId); //bricks mit richtiger Farbe erstellen
        }
        
        refresh();
    }
    
    private void showNextStone()              //<---wiki aktualisieren
    {
        setMoveBrickForNewStone(nextStoneId);
        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 4; y++)
            {
                nextStoneBrick[x][y] = 0;
            }
        }
        
        for (int i = 0; i < 4; i++)
        {
            nextStoneBrick[moveBrickX[i] - 3][moveBrickY[i]] = nextStoneId;
        }
    }
    
    private void setMoveBrickForNewStone(int stoneId)
    {
        switch (stoneId)
        {
            case 1: //blauer, I-Stein
                moveBrickX[0] = 4;
                moveBrickY[0] = 1;
                moveBrickX[1] = 4;
                moveBrickY[1] = 0;
                moveBrickX[2] = 4;
                moveBrickY[2] = 2;
                moveBrickX[3] = 4;
                moveBrickY[3] = 3;
            break;
            
            case 2: //orangener L-Stein
                moveBrickX[0] = 4;
                moveBrickY[0] = 2;
                moveBrickX[1] = 5;
                moveBrickY[1] = 3;
                moveBrickX[2] = 4;
                moveBrickY[2] = 1;
                moveBrickX[3] = 4;
                moveBrickY[3] = 3;
            break;
            
            case 3: //dunkelblauer, andersrum L-Stein
                moveBrickX[0] = 5;
                moveBrickY[0] = 2;
                moveBrickX[1] = 4;
                moveBrickY[1] = 3;
                moveBrickX[2] = 5;
                moveBrickY[2] = 1;
                moveBrickX[3] = 5;
                moveBrickY[3] = 3;
            break;
            
            case 4: //grüner S-Stein
                moveBrickX[0] = 4;
                moveBrickY[0] = 2;
                moveBrickX[1] = 5;
                moveBrickY[1] = 3;
                moveBrickX[2] = 4;
                moveBrickY[2] = 1;
                moveBrickX[3] = 5;
                moveBrickY[3] = 2;
            break;
            
            case 5: //roter, andersru S-Stein
                moveBrickX[0] = 5;
                moveBrickY[0] = 2;
                moveBrickX[1] = 4;
                moveBrickY[1] = 3;
                moveBrickX[2] = 5;
                moveBrickY[2] = 1;
                moveBrickX[3] = 4;
                moveBrickY[3] = 2;
            break;
            
            case 6: //gelber Block-Stein
                moveBrickX[0] = 4;
                moveBrickY[0] = 2;
                moveBrickX[1] = 4;
                moveBrickY[1] = 3;
                moveBrickX[2] = 5;
                moveBrickY[2] = 2;
                moveBrickX[3] = 5;
                moveBrickY[3] = 3;
            break;
            
            case 7: //rosa T-Stein
                moveBrickX[0] = 4;
                moveBrickY[0] = 2;
                moveBrickX[1] = 5;
                moveBrickY[1] = 2;
                moveBrickX[2] = 3;
                moveBrickY[2] = 2;
                moveBrickX[3] = 4;
                moveBrickY[3] = 3;
            break;
        }
    }
    
    private void setBrick(int x, int y, int status)
    {
        brick[x][y] = status;
    }
    
    private boolean movePossible(int x, int y)
    {
        if ((x >= 0) && (x < 10) && (y >= 0)&&(y < 24))
        {
            if (brick[x][y] == 0)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    private boolean passiveSlide(int direction)
    {
        boolean possible;
        possible = false;
        int colour;
        colour = brick[moveBrickX[0]][moveBrickY[0]];
        
        for (int i = 0; i < 4; i++)
        {
            setBrick(moveBrickX[i], moveBrickY[i], 0);
        }
        
        switch (direction)
        {
            case 0: //nach rechts
                if ((movePossible(moveBrickX[0] + 1, moveBrickY[0])) && (movePossible(moveBrickX[1] + 1, moveBrickY[1])) && (movePossible(moveBrickX[2] + 1, moveBrickY[2])) && (movePossible(moveBrickX[3] + 1, moveBrickY[3])))
                {
                    for (int i = 0; i < 4; i++)
                    {
                        moveBrickX[i] = moveBrickX[i] + 1;
                    }
                    possible = true;
                }
                else
                {
                    possible = false;
                }
             break;
             
             case 1: //nach unten
                if ((movePossible(moveBrickX[0], moveBrickY[0] + 1)) && (movePossible(moveBrickX[1], moveBrickY[1] + 1)) && (movePossible(moveBrickX[2], moveBrickY[2] + 1)) && (movePossible(moveBrickX[3], moveBrickY[3] + 1)))
                {
                    for (int i = 0; i < 4; i++)
                    {
                        moveBrickY[i] = moveBrickY[i] + 1;
                    }
                    possible = true;
                }
                else
                {
                    possible = false;
                }
             break;
             
             case 2: //nach links
                if ((movePossible(moveBrickX[0] - 1, moveBrickY[0])) && (movePossible(moveBrickX[1] - 1, moveBrickY[1])) && (movePossible(moveBrickX[2] - 1, moveBrickY[2])) && (movePossible(moveBrickX[3] - 1, moveBrickY[3])))
                {
                    for (int i = 0; i < 4; i++)
                    {
                        moveBrickX[i] = moveBrickX[i] - 1;
                    }
                    possible = true;
                }
                else
                {
                    possible = false;
                }
             break;
         }
         
        for (int i = 0; i < 4; i++)
        {
            setBrick(moveBrickX[i], moveBrickY[i], colour);
        }
        
        return possible;
    }
    
    public void activeSlide(int direction)
    {
        passiveSlide(direction);
        refresh();
    }
    
    public void turn()     //<--- kein boolean
    {
        int colour;
        colour = brick[moveBrickX[0]][moveBrickY[0]];
        
        int[] oldMoveBrickX;
        int[] oldMoveBrickY;
        
        oldMoveBrickX = new int[4];
        oldMoveBrickY = new int[4];
        
        for(int i = 0; i < 4; i++)
        {
            oldMoveBrickX[i] = moveBrickX[i];
            oldMoveBrickY[i] = moveBrickY[i];
        }
        
        for (int i = 0; i < 4; i++)
        {
            setBrick(moveBrickX[i], moveBrickY[i], 0);
        }
        
        
        if ((movePossible(moveBrickX[0] - (moveBrickY[1] - moveBrickY[0]), moveBrickY[0] + (moveBrickX[1] - moveBrickX[0])))&&(movePossible(moveBrickX[0] - (moveBrickY[2] - moveBrickY[0]), moveBrickY[0] + (moveBrickX[2] - moveBrickX[0])))&&(movePossible(moveBrickX[0] - (moveBrickY[3] - moveBrickY[0]), moveBrickY[0] + (moveBrickX[3] - moveBrickX[0]))))
        {
            for (int i = 0; i < 4; i++)
            {
                moveBrickX[i] = moveBrickX[0] - (oldMoveBrickY[i] - moveBrickY[0]);
                moveBrickY[i] = moveBrickY[0] + (oldMoveBrickX[i] - moveBrickX[0]);
            }
        }
        
        for (int i = 0; i < 4; i++)
        {
            setBrick(moveBrickX[i], moveBrickY[i], colour);
        }
        
        refresh();
    }
    
    public void setDown()     //<--- kein boolean
    {
        boolean possible;
        possible = true;
        while (possible == true)
        {
            possible = passiveSlide(1);
        }
        
        freeze();
    }
    
    private void freeze()
    {
        if ((moveBrickY[0] < 3) || (moveBrickY[1] < 3) || (moveBrickY[2] < 3) || (moveBrickY[3] < 3))
        {
            refresh();
            gameOver();
            return;
        }
       
        clearLines();
        newStone();
    }
    
    private void clearLines()
    {
        int clearedLinesInMove;
        clearedLinesInMove = 0;
        
        for (int i = 23; i > 3; i--)
        {
            if ((brick[0][i] > 0) && (brick[1][i] > 0) && (brick[2][i] > 0) && (brick[3][i] > 0) && (brick[4][i] > 0) && (brick[5][i] > 0) && (brick[6][i] > 0) && (brick[7][i] > 0) && (brick[8][i] > 0) && (brick[9][i] > 0))
            {
                clearedLinesInMove = clearedLinesInMove + 1;
                
            }
            
            for (int j = 0; j < 10; j++)
            {
                brick[j][i] = brick[j][i - clearedLinesInMove];
            }
        }
        
        clearedLines = clearedLines + clearedLinesInMove;
        //points = points + model.config.game.pointsForClearLinesInLevel(clearedLinesInMove, level);
        //level = model.config.game.levelWithLines(clearedLines);
        //tickInterval = model.config.game.tickIntervalForLevel(level);
        clock.setTickInterval(tickInterval);
    }
    
    private void freezeDelay()
    {
        if (freezeDelayOn == false)
        {
            clock.startFreezeDelay(freezeDelay);    // <--- im wiki ändern
            freezeDelayOn = true;
        }
    }
    
    public void freezeDelayEnd()
    {
        freezeDelayOn = false;
        if (passiveSlide(1) == false)
        {     
            freeze();
        }
        else
        {
            refresh();
        }
    }
    
    public void tick()   //<--- kein boolean
    {
        if (passiveSlide(1) == false)
        {
            freezeDelay();
        }
        else
        {
            refresh();
        }
    }
    
    public void setTickInterval(int newTickInterval)
    {
        tickInterval = newTickInterval;
        clock.setTickInterval(tickInterval);
    }
    
    private void refresh() // nur test methode, wird später durch aufruf an VIEW ersetzt
    {
        System.out.println("************");
        for(int y = 4; y < 24; y++)
        {
            System.out.print("*");
            for(int x = 0; x < 10; x++)
            {
                if (brick[x][y] > 0)
                {
                    System.out.print(brick[x][y]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            
            System.out.print("*");
            if((y < 8) && (y > 3))
            {
                System.out.print("\t"+"\t"+"\t");
                for (int x = 0; x < 3; x++)
                {
                    if (nextStoneBrick[x][y - 4] > 0)
                    {
                        System.out.print(nextStoneBrick[x][y - 4]);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.println("************");
        System.out.print("\n");
        System.out.print("\n");
    }
    
    private void gameOver()
    {
        clock.endTick();
        System.out.println("GAME OVER");
    }
    
    public void keyCode(int code)
    {
        switch (code)
        {
            case 0:
            activeSlide(0);
            break;
            case 1:
            activeSlide(1);
            break;
            case 2:
            activeSlide(2);
            break;
            case 3:
            turn();
            break;
            case 4:
            setDown();
            break;
            
        }
    }
   
}


