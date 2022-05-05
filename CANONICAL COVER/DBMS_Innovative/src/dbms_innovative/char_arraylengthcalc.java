/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbms_innovative;

/**
 *
 * @author ravip
 */
public class char_arraylengthcalc {
    public static void main(String[] args) {
//        char c[][] = new char[10][10];
//        char a[]= new char[10];
//        int i = 0;
//        c[0][0]='a';
//        c[1][0]='a';
//        c[1][1]='a';
//        int s;
//        a=c[1];
//        s=a.length;
//        System.out.print(s);
        
    }
    
    
//    private void step2(char s1x[][],char s1y[],int sum) {
//        int j = 0;// will tell position of the selected closure on whom we perform operation
//        char s2x[][] = new char[sum][a];
//        char s2y[] = new char[sum];
//        char closure[][] = new char[1000][1000];
//        char closurew[][] = new char[1000][1000];
//        int pos[] = new int[sum];
//        int posw[] = new int[sum];
////        int chec;
////        int chec1;
////    System.out.println("closure of the fd's");
//    while(j<sum){
//            int k = 0;//will give the position of last element in the array closure
//            while( k < s1x[j].length){
//            closure[j][k] = s1x[j][k];
//            k++;
//            }
//            
////            chec = s1x[j].length;
//            closure[j][k]=s1y[j];
//            k++;
//            
//            int k1 =0;//will tell the position of the s1y(the right side of fd) or s1x(left side of the fd) that is being checked and whether we have to input into closure or not
//            while(k1 < sum){
//                
//                if(k1==j){
//                    k1++;
//                }
//                
//                if(k1==sum){
//                    break;
//                }
//
//                if(k1!=j){
//                    int cnt = 0;//will check whether the s1x that is being checked has its prime attributes or not in the closure if not then we don't add.
//                    int k2 = 0;//will be used to loop the closure to check whether there is an attribute equal to the one in the closure in the fd that we will be checking
//                    if(k>=s1x[k1].length){
//                        int k3 = 0;// to get out of the loop if the attributes are not matching
//                        while(cnt<s1x[k1].length){
//                            k2=0;
//                            while(k2<k){
//                                if(closure[j][k2]==s1x[k1][cnt]){
//                                    cnt++;
//                                }
//                                k2++;
//                                
//                                if(cnt==s1x[k1].length){
//                                    closure[j][k]=s1y[k1];
//                                    k++;
//                                }
//                                
//                                if(cnt==s1x[k1].length){
//                                    break;
//                                }
//                                
//                                }
//                            
//                            k3++;
//                            if(k3==s1x[k1].length){
//                                break;
//                            } 
//                        }
//                        
//                    }
//                    k1++;
//                }
//            }
////            System.out.println(closure[j]);
//            j++;
//            }
//            
//            //this time we perform operations on the fd by assuming they don't exist
////            System.out.println("closure of the fd's assuming fd does not exist");
//            j=0;
//            
//            while(j<sum){
//            int k = 0;//will give the position of last element in the array closurew
//            while(k < s1x[j].length){
//            closurew[j][k] = s1x[j][k];
//            k++;
//            }
//            
////            chec = s1x[j].length;
////            closure[j][k]=s1y[j];
////            k++;
//            
//            int k1 =0;//will tell the position of the s1y(the right side of fd) or s1x(left side of the fd) that is being checked and whether we have to input into closurew or not
//            while(k1 < sum){
//                
//                if(k1==j){
//                    k1++;
//                }
//                
//                if(k1==sum){
//                    break;
//                }
//
//                if(k1!=j){
//                    int cnt = 0;//will check whether the s1x that is being checked has its prime attributes or not in the closurew if not then we don't add.
//                    int k2 = 0;//will be used to loop the closurew to check whether there is an attribute equal to the one in the closurew in the fd that we will be checking
//                    if(k>=s1x[k1].length){
//                        int k3 = 0;// to get out of the loop if the attributes are not matching
//                        while(cnt<s1x[k1].length){
//                            k2=0;
//                            while(k2<k){
//                                if(closurew[j][k2]==s1x[k1][cnt]){
//                                    cnt++;
//                                }
//                                k2++;
//                                
//                                if(cnt==s1x[k1].length){
//                                    closurew[j][k]=s1y[k1];
//                                    k++;
//                                }
//                                
//                                if(cnt==s1x[k1].length){
//                                    break;
//                                }
//                                
//                                }
//                            
//                            k3++;
//                            if(k3==s1x[k1].length){
//                                break;
//                            } 
//                        }
//                        
//                    }
//                    k1++;
//                }
//            }
////            System.out.println(closurew[j]);
//            j++;
//            }
//            
////        int ax=0;
////        while(true){
////            System.out.print(closure[0][ax]);
////            
////            if(closure[0][ax]=='\u0000'){
////            break;
////        }
////            ax++;
////            
////        }
//        
//            //finding all the positions of last element of all the closures in the closure array
//            j=0;
//            while(j<sum){
//                int k = 0;
//                pos[j]=0;
//                while(closure[j][k]!='\u0000'){
//                    k++;
//                }
//                pos[j]=k+1;
////                System.out.println(pos[j]);
//                j++;
//            }
//            
//            //finding all the positions of last element of all the closures in the closurew array
//            j=0;
//            while(j<sum){
//                int k = 0;
//                posw[j]=0;
//                while(closurew[j][k]!='\u0000'){
//                    k++;
//                }
//                posw[j]=k+1;
////                System.out.println(posw[j]);
//                j++;
//            }
//            
//            //removing the repeating elements in closures in the closure array
//            System.out.println("closure of the fd's");
//            j=0;
//            
//            while(j<sum){
//                int k=0;
//                while(k<pos[j]){
//                    int k1=0;
//                    while(k1<pos[j]){
//                        if(k==k1){
//                            k1++;
//                        }
//                        
//                        if(k1==pos[j]){
//                            break;
//                        }
//                        
//                        if(closure[j][k]==closure[j][k1]){
//                            int k2=k1;
//                            while(k2<pos[j]){
//                                closure[j][k2]=closure[j][k2+1];
//                                k2++;
//                            }
//                        }
//                     k1++;   
//                    }
//                    k++;
//                }
//                System.out.println(closure[j]);
//                j++;
//            }
//            
//            //removing the repeating elements in closures in the closurew array
//            System.out.println("closure of the fd's assuming fd does not exist");
//            j=0;
//            
//            while(j<sum){
//                int k=0;
//                while(k<posw[j]){
//                    int k1=0;
//                    while(k1<posw[j]){
//                        if(k==k1){
//                            k1++;
//                        }
//                        
//                        if(k1==posw[j]){
//                            break;
//                        }
//                        
//                        if(closurew[j][k]==closurew[j][k1]){
//                            int k2=k1;
//                            while(k2<posw[j]){
//                                closurew[j][k2]=closurew[j][k2+1];
//                                k2++;
//                            }
//                        }
//                     k1++;   
//                    }
//                    k++;
//                }
//                System.out.println(closurew[j]);
//                j++;
//            }
//            //repeated block
//            //finding all the positions of last element of all the closures in the closure array
//            j=0;
//            while(j<sum){
//                int k = 0;
//                pos[j]=0;
//                while(closure[j][k]!='\u0000'){
//                    k++;
//                }
//                pos[j]=k+1;
////                System.out.println(pos[j]);
//                j++;
//            }
//            
//            //finding all the positions of last element of all the closures in the closurew array
//            j=0;
//            while(j<sum){
//                int k = 0;
//                posw[j]=0;
//                while(closurew[j][k]!='\u0000'){
//                    k++;
//                }
//                posw[j]=k+1;
////                System.out.println(posw[j]);
//                j++;
//            }
//            //repeated block end
//            //finding if the closures of the closure array are equal to closures of the closurew array or not
//           int n=0; 
//           j=0;
//           while(j<sum){
//               int k=0;
//               int cnt=0;
//               if(pos[j]==posw[j]){
//                   while(k<sum){
//                       int k1=0;
//                       
//                       while(k1<sum){
//                           if(cnt<pos[j]){
//                               if(closure[j][k]==closurew[j][k1]){
//                                   cnt++;
//                               }
//                           }
//                           
//                           k1++;
//                       }
//                       k++;
//                   }
//               }
//               if(pos[j]!=posw[j]){
//                   s2x[n]=s1x[j];
//                   s2y[n]=s1y[j];
//                   n++;
//               }
//               
//               if(cnt!=pos[j] && pos[j]==posw[j]){
//                    s2x[n]=s1x[j];
//                    s2y[n]=s1y[j];
//                    n++;
//               }
//               
//               j++;
//           }
//           
//           j=0;
//        while(j<n){
//                System.out.print(s2x[j]);
//                System.out.print("->");
//                System.out.print(s2y[j]);
//                System.out.print("\n");
//                j++;
//            }
//        
////
////        System.out.print(s2x[0]);
//        }
}
//
//if(cnt==pos[j]&&j+1<sum){
//                       int j1=j;
//                       while(s1y[j1]!='\u0000'){
//                       s1x[j1]=s1x[j1+1];
//                       s1y[j1]=s1y[j1+1];
//                       closure[j1]=closure[j1+1];
//                       closurew[j1]=closurew[j1+1];
//                       pos[j1]=pos[j1+1];
//                       posw[j1]=posw[j1+1];
//                       j1++;
//                       }
//                       
//                       sum--;
//                       }