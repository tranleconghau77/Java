import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte chon;
		Scanner doc = new Scanner(System.in);
		DSHangHoa dshh=new DSHangHoa();
		HangHoa h;
		do {
			System.out.println("1.Nhap Danh Sach Mat Hang");
			System.out.println("2.Them Mot Mat Hang Vao Danh Sach");
			System.out.println("3.Xuat Mat Hang Theo Loai");
			System.out.println("0.Thoat");
			System.out.println("Chon chuc nang");
			chon= doc.nextByte();
			switch (chon)
			{
				case 1:
					dshh.nhap();
					break;
				case 2:
					System.out.println("Mat Hang Muon Them");
					System.out.println("1.Dien May \n2.Thuc Pham");
					byte loai=doc.nextByte();
					if(loai==1)
					{
						h=new HangDM();
					}
					else
					{
						h=new HangTP();
					}
					h.nhap();
					dshh.themMH(h);
					break;
				case 3:
					System.out.println("Xuat Danh Sach Mat Hang Nao ");
					System.out.println("1.Dien May \n2.Thuc Pham");
					byte loaimh=doc.nextByte();
					dshh.xuatDSTheoLoai(loaimh);
					break;
				default:
					break;
			}
		}
		while(chon!=0);
	}
}
