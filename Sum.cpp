
#include<iostream>
using namespace std;

class OrderItem
{
	int propertiesID;
	int OrderID;
	int ProductID;
	int Price;
	int Qty;

	public:
		void input(int v,int w, int x, int y, int z)
		{
		    propertiesID=v;
            OrderID=w;
            ProductID=x;
            Price=y;
            Qty=z;
		}

		void sum()
		{   int total=Price*Qty;
			cout<<"total Price = "<<total<<"\t";
		}
};

main()
{
	OrderItem o;
	o.input(1,1,1,5000,2);
	o.sum();
	return 0;
}