package jungmin.kdelivery;

public class Feedback {
  private String customerName;
  private String shopName;
  private String foodName;
  private int grade;

  /**
   * @Feedback() : 정보를 저장합니다
   */
  public void Feedback(String customerName, String shopName, String foodName, int grade) {
    this.customerName = customerName;
    this.shopName = shopName;
    this.foodName = foodName;
    this.grade = grade;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getShopName() {
    return shopName;
  }

  public String getFoodName() {
    return foodName;
  }

  public int getGrade() {
    return grade;
  }

  /**
   * @getStars() : 사용자가 입력한 점수가 별점으로 전환
   */
  public void getStars() {
    switch (grade){
      case 1 :
      System.out.println("★");
      break;
      case 2 :
      System.out.println("★★");
      break;
      case 3 :
      System.out.println("★★★");
      break;
      case 4 :
      System.out.println("★★★★");
      break;
      case 5 :
      System.out.println("★★★★★");
      break;
      default:
        System.out.println("1점 ~5점 입력");
    }
  }

  /**
   * @printInfo() : 출력
   */
//  public void printInfo() {
//    System.out.println("별점 : " + getStars());
//  }


}
