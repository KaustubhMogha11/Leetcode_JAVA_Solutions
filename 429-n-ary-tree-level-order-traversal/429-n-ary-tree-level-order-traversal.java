class Solution {
 public List<List<Integer>> levelOrder(Node root) {
       
            
    		 List<List<Integer>> result = new ArrayList<List<Integer>>();
      if(root == null)
    			 return result;
    		 Queue<Node> quee = new LinkedList<Node>();
    		 quee.add(root);
    		 
    		 while(!quee.isEmpty())
    		 {
    			 Queue<Node> quee1 = new LinkedList<Node>();
    			 List<Integer> res = new ArrayList<Integer>();
    			 while(!quee.isEmpty())
    			 {
    				 Node n = quee.poll();
                     
    				 res.add(n.val);
        			 for(int i = 0;i<n.children.size();i++)
        			 {
                         if(n.children.get(i) != null)
        				 quee1.add(n.children.get(i));
        			 }
    			 }
    			 result.add(res);
    			 quee = quee1;
    			
     		 }
    		 
    		 
    		 return result;
    		 
    		 
    	        
    	    }
}