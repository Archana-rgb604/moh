class Assi3
{
public static void main(String[] args)
{
int i=11;
for(int a=1;a<=4;a++)
{
for(int b=1;b<=5;b++)
{
System.out.print(i+" ");
i++;
}
i=i+5;
System.out.println();
}
//<<<<<<<<<<<<<<<<<<---------------------------->>>>>>>>>>>>>>

/*for(int a=1;a<=5;a++)
{
for(int b=1;b<=5;b++)
{
System.out.print(a+""+b+" ");
}
System.out.println( );
}*/

//<<<<<<<<<<<<<<<<<<---------------------------->>>>>>>>>>>>>>

/*for(int m=1;m<=5;m++)
{
for(int l=1;l<=m;l++)
{
System.out.print("*"+" ");
}
System.out.println( );
}*/

//<<<<<<<<<<<<<<<<<<---------------------------->>>>>>>>>>>>>>


for(int m=1;m<=5;m++)
{
for(int l=1;l<=5;l++)
{
if(l<=m)
{
System.out.print( "*" +" ");
}
else
{
System.out.print(" ");
}
}
System.out.println( );
}

//<<<<<<<<<<<<<<<<<<<<----------------------------->>>>>>>>>>>>>>>>>>>>

for(int m=1;m<=5;m++)
{
for(int l=1;l<=5;l++)
{
if(m==1||m==5||l==1||l==5)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println( );
}

//<<<<<<<<<<<<<<<<<------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>

for(int m=1;m<=5;m++)
{
for(int l=1;l<=5;l++)
{
if(m==1||l==3)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println( );
}

//<<<<<<<<<<<<<<<<------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

for(int m=1;m<=5;m++)
{
for(int l=1;l<=5;l++)
{
if(l==1||l==5||m==3)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println( );
}

//<<<<<<<<<<<<<<<<------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

for(int m=1;m<=5;m++)
{
for(int l=1;l<=5;l++)
{
if(l==1||l==5||m==1||m==5||m==l||)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println( );
}



}
}
