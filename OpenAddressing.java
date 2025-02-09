package hashing;

//open addressing
class Myhash1{
	int arr[];
	int cap,size;
	Myhash1(int c){
		cap=c;
		size=0;
		arr= new int[cap];
		for (int i=0;i<cap;i++) {
			arr[i]=-1;
		}
	}
	int hash(int key) {
		return key%cap;
	}
	boolean search(int key) {
		int h=hash(key);
		int i=h;
		while (arr[i]!=-1) {
			if (arr[i]==key) {
				return true;
			}
			i=(i+1)%cap;
			if (i==h) {
				return false;
			}
		}
		return false;
	}
	boolean erase(int key) {
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1) {
			if (arr[i]==key) {
				arr[i]=-2;
				return true;
			}
			i=(i+1)%cap;
			if (i==h) {
				return false;
			}
		}
		return false;
	}
	boolean insert(int key) {
		if (size==cap) {
			return false;
		}
		int i=hash(key);
		while (arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key) {
			i=(i+1)%cap;
		}
		if (arr[i]==key) {
			return false;
		}
		else {
			arr[i]=key;
			size++;
			return true;
		}
	}
}

public class OpenAddressing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myhash1 obj= new Myhash1(7);
		obj.insert(49);
		obj.insert(50);
		obj.insert(63);
		if (obj.search(63)==true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		obj.erase(63);
		if (obj.search(63)==true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
