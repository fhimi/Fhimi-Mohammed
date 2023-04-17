package Metier;

import Dao.daoInterface;


public class metierImplementation implements  metierInterface{
    private daoInterface dao;

    public metierImplementation(daoInterface dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double val = dao.getData();
        return val*5;
    }

    // Inject an object of class that implements daoInterface in the dao variable
    public void setDao(daoInterface dao) {
        this.dao = dao;
    }
}
