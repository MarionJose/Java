class User{
    private int points;
    // public User(){
    //     points=500;

    

    // }
    public User(boolean isAReferal){
              if(isAReferal){
                points = 1000;
              }
              else{
                points = 500;
              }
            }
    public User(String isAReferal){
        if(isAReferal == "Employee"){
          points = 5000;
        }
        else{
          points = 500;
   }
  }
      public void getPoints() {
        System.out.println("points --> " + points);
      }
}


// class User {
//     private int points;
  
//     // public User() {
//     //   points = 500;
//     // }
  
    
//   }
//     public User(boolean isAReferal){
//       if(isAReferal){
//         points = 1000;
//       }
//       else{
//         points = 500;
//  }
// }
//     public void getPoints() {
//       System.out.println("points --> " + points);
//     }
//   }