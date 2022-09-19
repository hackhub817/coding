// THIS THE PROBLEM NAME PEPCODERS AND BITS

//  we have to first find the number of bits preset by using josup alogierm by taking rbsm and subtracting

//  And after that we have take three parameter as n and k as set bit and i as 63 bit size ie long
//  hamne sabse phle mask nikalna 63 but tak ka something like taht 100000000000000..... aur and karke dekha agar bit on thi 
// matalb 0 to ham cahnge nahi karegay wahi result h and agar h to 1 ki condition use ki and 
// aur ncr kiya h



public static long solution(long n, int k, int i) {
       
    if(i==0)
    {
        return 0;
    }
     long mask=1L<<i;
    long sum=0;
    
    if((mask&n)==0)
    {
        sum=solution(n,k,i-1);
    }else
    {
        long res1=solution(n,k-1,i-1);
        long res0=ncr(i,k);
         sum=res1+res0;
        
    }
    return sum;
    


    // OTHER QUESTION OF ABBRIVATION

    // in this , hamne loop chalaya h jitne bhi subsets bann sktay the tab tak
    // ek loop chalaya h length of the string tak isme ki hamne mask bhi n=banya h jitne usme words h uska aur dhere dhere 
    // decrese kiya h 
    // aur agar bit off h to charcter print kiya h warna count hi kiya ham  
   


    for(int i = 0 ; i< Math.pow(2,str.length()); i++)
    {
        StringBuilder ar = new StringBuilder();
            int c=0;
     for(int j = 0; j< str.length(); j++ )
     {
         char ch = str.charAt(j);
        int mask= 1<<str.length()-1-j;
        if((mask&i)==0)
        {
            if(c==0)
            {
                ar.append(ch);
            }
            else
            {
                ar.append(c);
                ar.append(ch);
                c=0;
            }
          
          
        }
        else
        {
            c++;
        }
        
    }
    if(c>0)
    {
        ar.append(c);
    }
    System.out.println(ar);
    }


    // UTF-8
    // to isme ham bus kuch khas nahi karegay bus yeh cheack karegay ke 8 bit main se 
    // 0
    // 110....  10..... 
    // 1110.....10.. 10....
    // 11110 10 10 10 
    // ka sequence aata y anhia 




    for(int i :arr)
    {
        if(c==0)
        {
        if((i>>7)==0b0)
        {
            c=0;
        }else if((i>>5)==0b110)
        {
            c=1;
        }else if((i>>4)==0b1110)
        {
            c=2;
        }else if((i>>3)==0b11110)
        {
            c=3;
        }
        }
        else
        {
            if((i>>6)==0b10)
            {
                c--;
            }
            else
            {
                return false;
            }
        }
        
    }
    if(c==0)
    {
        return true;
    }
    else
    {
        return false;
    }