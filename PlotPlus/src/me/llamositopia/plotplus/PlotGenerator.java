package me.llamositopia.plotplus;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class PlotGenerator extends ChunkGenerator {
    public short[][] generateExtBlockSections(World world, Random random, int cx, int cz, BiomeGrid biomes){
        short[][] result = new short[world.getMaxHeight()/16][];
        for (int csx = 0; csx < 16; csx++){
            for (int y = 0; y < world.getMaxHeight(); y++){
                for (int csz = 0; csz < 16; csz++){
                    int x = cx*16+csx;
                    int z = cz*16+csz;
                    if (x<0)
                        x=-x;
                    if (z<0)
                        z=-z;
                    if (y < 64){
                        setBlock(result, csx, y, csz, (short) 3);
                    }else if (y == 64){
                        if (x%73==0 || x%73==1 || x%73==2 || x%73==6 || x%73==7 || x%73==8 || z%73==0 || z%73==1 || z%73==2 || z%73==6 || z%73==7 || z%73==8){
                            setBlock(result, csx, y, csz, (short) 24);
                        }else{
                            setBlock(result, csx, y, csz, (short) 2);
                        }
                    }else if (y == 65){
                        if (x%73>=3 && x%73<=5 && z%73>=3 && z%73<=5){
                            if (x%73==4 && z%73==4){
                                setBlock(result, csx, y, csz, (short) 8);
                            }else{
                                setBlock(result, csx, y, csz, (short) 44);
                            }
                        }else if (x%73==4){
                            if (z%73>9 && z%73<69 && z%5==0){
                                if (z%10==0){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }else{
                                    setBlock(result, csx, y, csz, (short) 17);
                                }
                            }
                        }else if (z%73==4){
                            if (x%73>9 && x%73<69 && x%5==0){
                                if (x%10==0){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }else{
                                    setBlock(result, csx, y, csz, (short) 17);
                                }
                            }
                        }
                    }else if (y == 66){
                        if (x%73>=3 && x%73<=5 && z%73>=3 && z%73<=5){
                            if (x%73==4 && z%73==4){
                                setBlock(result, csx, y, csz, (short) 8);
                            }else{
                                setBlock(result, csx, y, csz, (short) 44);
                            }
                        }else if (x%73==4){
                            if (z%73>9 && z%73<69 && z%5==0){
                                if (z%10==0){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }else{
                                    setBlock(result, csx, y, csz, (short) 17);
                                }
                            }
                        }else if (z%73==4){
                            if (x%73>9 && x%73<69 && x%5==0){
                                if (x%10==0){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }else{
                                    setBlock(result, csx, y, csz, (short) 17);
                                }
                            }
                        }
                    }else if (y == 67){
                        if (x%73>=3 && x%73<=5 && z%73>=3 && z%73<=5){
                            if (x%73==4 && z%73==4){
                                setBlock(result, csx, y, csz, (short) 8);
                            }else{
                                setBlock(result, csx, y, csz, (short) 44);
                            }
                        }else if (x%73==4){
                            if (z%73>9 && z%73<69 && z%5==0){
                                if (z%10==0){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }else{
                                    setBlock(result, csx, y, csz, (short) 17);
                                }
                            }
                        }else if (z%73==4){
                            if (x%73>9 && x%73<69 && x%5==0){
                                if (x%10==0){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }else{
                                    setBlock(result, csx, y, csz, (short) 17);
                                }
                            }
                        }
                    }else if (y == 68){
                        if (z%73>9 && z%73<69){
                            if (z%10==0){
                                if (x%73==3){
                                    setBlock(result, csx, y, csz, (short) 89);
                                }else if (x%73==4){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }else if (x%73==5){
                                    setBlock(result, csx, y, csz, (short) 89);
                                }
                            }else if (z%10==4){
                                if ((z+1)%73>9 && (z+1)%73<69)
                                if (x%73==4){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (z%10==5){
                                if (x%73==3){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }else if (x%73==4){
                                    setBlock(result, csx, y, csz, (short) 17);
                                }else if (x%73==5){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (z%10==6){
                                if ((z-1)%73>9 && (z-1)%73<69)
                                if (x%73==4){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }
                        }else if (x%73>9 && x%73<69){
                            if (x%10==0){
                                if (z%73==3){
                                    setBlock(result, csx, y, csz, (short) 89);
                                }else if (z%73==4){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }else if (z%73==5){
                                    setBlock(result, csx, y, csz, (short) 89);
                                }
                            }else if (x%10==4){
                                if ((x+1)%73>9 && (x+1)%73<69)
                                if (z%73==4){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (x%10==5){
                                if (z%73==3){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }else if (z%73==4){
                                    setBlock(result, csx, y, csz, (short) 17);
                                }else if (z%73==5){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (x%10==6){
                                if ((x-1)%73>9 && (x-1)%73<69)
                                if (z%73==4){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }
                        }
                    }else if (y == 69){
                        if (z%73>9 && z%73<69){
                            if (x%10==0){
                                if (z%73>=4 && z%73<=6){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }
                            }else if (z%10==3){
                                if ((z+2)%73>9 && (z+2)%73<69)
                                if (x%73>=3 && x%73<=5){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (z%10==4){
                                if ((z+1)%73>9 && (z+1)%73<69)
                                if (x%73>=2 && x%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (z%10==5){
                                if (x%73>=2 && x%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (z%10==6){
                                if ((z-1)%73>9 && (z-1)%73<69)
                                if (x%73>=2 && x%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (z%10==7){
                                if ((z-2)%73>9 && (z-2)%73<69)
                                if (x%73>=3 && x%73<=5){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }
                        }
                        if (x%73>9 && x%73<69){
                            if (x%10==0){
                                if (z%73>=4 && z%73<=6){
                                    setBlock(result, csx, y, csz, (short) 85);
                                }
                            }else if (x%10==3){
                                if ((x+2)%73>9 && (x+2)%73<69)
                                if (z%73>=3 && z%73<=5){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (x%10==4){
                                if ((x+1)%73>9 && (x+1)%73<69)
                                if (z%73>=2 && z%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (x%10==5){
                                if (z%73>=2 && z%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (x%10==6){
                                if ((x-1)%73>9 && (x-1)%73<69)
                                if (z%73>=2 && z%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (x%10==7){
                                if ((x-2)%73>9 && (x-2)%73<69)
                                if (z%73>=3 && z%73<=5){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }
                        }
                    }else if (y == 70){
                        if (z%73>9 && z%73<69){
                            if (z%10==3){
                                if ((z+2)%73>9 && (z+2)%73<69)
                                    if (x%73>=3 && x%73<=5){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (z%10==4){
                                if ((z+1)%73>9 && (z+1)%73<69)
                                    if (x%73>=2 && x%73<=6){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (z%10==5){
                                if (x%73>=2 && x%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (z%10==6){
                                if ((z-1)%73>9 && (z-1)%73<69)
                                    if (x%73>=2 && x%73<=6){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (z%10==7){
                                if ((z-2)%73>9 && (z-2)%73<69)
                                    if (x%73>=3 && x%73<=5){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }
                        }
                        if (x%73>9 && x%73<69){
                            if (x%10==3){
                                if ((x+2)%73>9 && (x+2)%73<69)
                                    if (z%73>=3 && z%73<=5){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (x%10==4){
                                if ((x+1)%73>9 && (x+1)%73<69)
                                    if (z%73>=2 && z%73<=6){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (x%10==5){
                                if (z%73>=2 && z%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (x%10==6){
                                if ((x-1)%73>9 && (x-1)%73<69)
                                    if (z%73>=2 && z%73<=6){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (x%10==7){
                                if ((x-2)%73>9 && (x-2)%73<69)
                                    if (z%73>=3 && z%73<=5){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }
                        }
                    }else if (y == 71){
                        if (z%73>9 && z%73<69){
                            if (z%10==3){
                                if ((z+2)%73>9 && (z+2)%73<69)
                                    if (x%73>=3 && x%73<=5){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (z%10==4){
                                if ((z+1)%73>9 && (z+1)%73<69)
                                    if (x%73>=2 && x%73<=6){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (z%10==5){
                                if (x%73>=2 && x%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (z%10==6){
                                if ((z-1)%73>9 && (z-1)%73<69)
                                    if (x%73>=2 && x%73<=6){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (z%10==7){
                                if ((z-2)%73>9 && (z-2)%73<69)
                                    if (x%73>=3 && x%73<=5){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }
                        }
                        if (x%73>9 && x%73<69){
                            if (x%10==3){
                                if ((x+2)%73>9 && (x+2)%73<69)
                                    if (z%73>=3 && z%73<=5){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (x%10==4){
                                if ((x+1)%73>9 && (x+1)%73<69)
                                    if (z%73>=2 && z%73<=6){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (x%10==5){
                                if (z%73>=2 && z%73<=6){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (x%10==6){
                                if ((x-1)%73>9 && (x-1)%73<69)
                                    if (z%73>=2 && z%73<=6){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (x%10==7){
                                if ((x-2)%73>9 && (x-2)%73<69)
                                    if (z%73>=3 && z%73<=5){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }
                        }
                    }else if (y == 72){
                        if (z%73>9 && z%73<69){
                            if (z%10==4){
                                if ((z+1)%73>9 && (z+1)%73<69)
                                    if (x%73==4){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (z%10==5){
                                if (x%73==3){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }else if (x%73==4){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }else if (x%73==5){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (z%10==6){
                                if ((z-1)%73>9 && (z-1)%73<69)
                                    if (x%73==4){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }
                        }else if (x%73>9 && x%73<69){
                            if (x%10==4){
                                if ((x+1)%73>9 && (x+1)%73<69)
                                    if (z%73==4){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }else if (x%10==5){
                                if (z%73==3){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }else if (z%73==4){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }else if (z%73==5){
                                    setBlock(result, csx, y, csz, (short) 18);
                                }
                            }else if (x%10==6){
                                if ((x-1)%73>9 && (x-1)%73<69)
                                    if (z%73==4){
                                        setBlock(result, csx, y, csz, (short) 18);
                                    }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
  
    protected void setBlock(short[][] result, int x, int y, int z, short blockkid) {
        if (result[(y >> 4)] == null){
            result[(y >> 4)] = new short[4096];
        }
        result[(y >> 4)][((y & 0xF) << 8 | z << 4 | x)] = blockkid;
    }
  
}
