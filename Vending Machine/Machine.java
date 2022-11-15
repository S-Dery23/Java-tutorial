public class Machine {
    
     Item[][] items;

    public Machine(Item[][] items){
        this.items = new Item[items.length][items[0].length];
            for (int i = 0; i < items.length; i++) {
                for (int j = 0; j < items[0].length; j++) {
                    this.items[i][j] = new Item(items[i][j]);
                }
            }
        }
        
    
    
    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */

    
    
}