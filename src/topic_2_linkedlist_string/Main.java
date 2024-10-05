public static void main(String[] args) {
        
       char [][]bastalagi = {
           
           {'*'},          
           {'*','*'},  
           {'*','*','*'},  
           {'*','*','*','*',}, 
           {'*','*','*','*','*'},           
           {'*','*','*','*','*','*'},
           {'*','*','*','*','*','*','*'},           
           {'*','*','*','*','*','*','*','*'},           
           
       };
       for (char i=0;i<bastalagi.length;i++){
           for (char j=0;j<bastalagi[i].length;j++){
               System.out.print(bastalagi[i][j]+" ");
           }
           System.out.println();
           
           
       }
      
    }