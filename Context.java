package StrategyPattern;

public class Context {
    
	private StrategyInterface
	/**
	 * @param strategy
	 */
	strategy;
     
	/**
	 * The context = StrategyInterface
	 * @param strategy
	 */
     public Context(StrategyInterface strategy) {
    	 this.strategy = strategy;
	}
     
    /**
     *  
     * @return strategy.yourFonction
     */
    public String executeStrategy() {
    	 return strategy.yourFonction();
    }
}
