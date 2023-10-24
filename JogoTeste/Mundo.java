import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound ("music.mp3");
    
    public void started()
    {
    bgMusic.playLoop();
    }
    public void stopped()
    {
    bgMusic.pause();
    }   

    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        bela bela = new bela();
        addObject(bela,211,367);
        fera fera = new fera();
        addObject(fera,559,360);
        fera.setLocation(391,388);
        fera.setLocation(375,389);
        fera.setLocation(594,323);

        bela.setLocation(516,341);
        fera.setLocation(387,351);

        bela.setLocation(597,325);
        removeObject(bela);
        fera.setLocation(568,284);
        removeObject(fera);
        bela bela2 = new bela();
        addObject(bela2,226,369);
        fera fera2 = new fera();
        addObject(fera2,580,350);
        Counter counter = new Counter();
        addObject(counter,221,32);
        Counter2 counter2 = new Counter2();
        addObject(counter2,511,35);
        bela2.setLocation(370,170);
        bela2.setLocation(258,402);
    }
}
