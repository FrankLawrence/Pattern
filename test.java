public class test
{
    Game game;
    public test()
    {
        game = new Game();
        fill();
    }
    
    public void fill(){
        game.setRow(3,2,6,0);
        game.setRow(2,1,6,1);
        game.setRow(1,1,6,2);
        game.setRow(4,1,3);
        game.setRow(2,1,4,4);
        game.setRow(3,1,2,5);
        game.setRow(7,1,2,6);
        game.setRow(3,1,7);
        game.setRow(1,2,8);
        game.setRow(3,9);
        game.setRow(3,5,10);
        game.setRow(14,11);
        game.setRow(14,12);
        game.setRow(3,5,13);
        game.setRow(2,1,14);
        game.setColumn(3, 3, 3, 13);
        game.setColumn(5, 6, 11);
        for(int i=0;i<15;i++){
            game.calcRS(i);
            game.calcCS(i);
        }
        game.getfilled();
        System.out.println(" ");
    }
}
