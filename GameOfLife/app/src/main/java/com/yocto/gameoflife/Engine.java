package com.yocto.gameoflife;

public interface Engine {
    public Cells nextGen(Cells cells);
}