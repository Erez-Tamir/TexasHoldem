public class HandRank {
    int type;
    int[] highs=new int[5];
    int[] highOfSpecial= new int[2];
    static String comp(HandRank p1,HandRank p2,String id1,String id2){
        if (p1.type>p2.type) {
            return(id1);
        }
        else if (p1.type<p2.type) {
            return(id2);
        }
        else{
            if (p1.highOfSpecial[0]>p2.highOfSpecial[0]) {
                return(id1);
            }
            else if (p1.highOfSpecial[0]<p2.highOfSpecial[0]) {
                return(id2);
            }
            else{
                if (p1.highOfSpecial[1]>p2.highOfSpecial[1]) {
                    return(id1);
                }
                else if (p1.highOfSpecial[1]<p2.highOfSpecial[1]) {
                    return(id2);
                }
                else{
                    if (p1.highs[0]>p2.highs[0]) {
                        return(id1);
                    }
                    else if (p1.highs[0]<p2.highs[0]) {
                        return(id2);
                    }
                    else{
                        if (p1.highs[1]>p2.highs[1]) {
                            return(id1);
                        }
                        else if (p1.highs[1]<p2.highs[1]) {
                            return(id2);
                        }
                        else{
                            if (p1.highs[2]>p2.highs[2]) {
                                return(id1);
                            }
                            else if (p1.highs[2]<p2.highs[2]) {
                                return(id2);
                            }
                            else{
                                if (p1.highs[3]>p2.highs[3]) {
                                    return(id1);
                                }
                                else if (p1.highs[3]<p2.highs[3]) {
                                    return(id2);
                                }
                                else{
                                    if (p1.highs[4]>p2.highs[4]) {
                                        return(id1);
                                    }
                                    else if (p1.highs[4]<p2.highs[4]) {
                                        return(id2);
                                    }
                                    else{
                                        return("\0");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
