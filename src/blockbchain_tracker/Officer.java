package blockbchain_tracker;

import java.util.Iterator;

public class Officer {

    static Boolean checkGuilty(Blockchain blockchain, PrivateData order){
        String guiltyHash = order.getHashedData();
        if(!blockchain.isValid()) return false;
//        Iterator iterator = blockchain.chain.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for(int i=1; i < blockchain.chain.size(); i++) {
            if (blockchain.chain.get(i).getData().equals(guiltyHash)) return true;
        }
        return false;
    }
}
