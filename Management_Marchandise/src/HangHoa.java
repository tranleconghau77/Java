import java.util.*;
import java.io.*;
public class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected long donGia;
	
	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}

	public HangHoa()
	{
		this.maHang="";
		this.tenHang="";
		this.donGia=0;
	}
	
	public HangHoa(String matHang, String tenHang, long dongGia)
	{
		this.maHang=matHang;
		this.tenHang=tenHang;
		this.donGia=dongGia;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma hang");
		maHang=sc.nextLine();
		System.out.println("Nhap ten hang");
		tenHang=sc.nextLine();
		System.out.println("Nhap don gia");
		sc=new Scanner(System.in);
		donGia=sc.nextLong();
	}
	
	public void xuat()
	{
		System.out.println("Ma hang la"+maHang);
		System.out.println("Ten hang la"+tenHang);
		System.out.println("Don gia la"+donGia);
	}
	
}
class HangDM extends HangHoa
{
	private int thoiGianBH;
	private long dienAp;
	private int congSuat;
	
	public int getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(int thoiGianBH) {
		this.thoiGianBH = thoiGianBH;
	}
	public long getDienAp() {
		return dienAp;
	}
	public void setDienAp(long dienAp) {
		this.dienAp = dienAp;
	}
	public int getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	public HangDM()
	{
		super();
		thoiGianBH =0;
		dienAp=0;
		congSuat=0;
	}
	public HangDM(String maHang, String tenHang,long donGia,int thoiGianBaoHanh,long dienAp,int congSuat)
	{
		super(maHang,tenHang,donGia);
		this.thoiGianBH=thoiGianBaoHanh;
		this.dienAp=dienAp;
		this.congSuat=congSuat;
		
	}
	public void nhap()
	{
		super.nhap();
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap thoi gian bao hanh");
		thoiGianBH=sc.nextInt();
		System.out.println("Nhap dien ap");
		dienAp=sc.nextLong();
		System.out.println("Nhap cong suat");
		congSuat=sc.nextInt();
	}
	public void xuat()
	{
		super.xuat();
		System.out.println("Thoi gian bao hanh la"+thoiGianBH);
		System.out.println("Dien ap la"+dienAp);
		System.out.println("cong Suat la"+congSuat);
	}
}

class HangTP extends HangHoa
{
	private int ngaySX;
	public int getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(int ngaySX) {
		this.ngaySX = ngaySX;
	}
	public int getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(int ngayHH) {
		this.ngayHH = ngayHH;
	}
	private int ngayHH;
	public HangTP()
	{
		super();
		ngaySX=0;
		ngayHH=0;
	}
	public HangTP(String matHang,String tenHang,long donGia, int ngaySX,int ngayHH)
	{
		super(matHang,tenHang,donGia);
		this.ngaySX=ngaySX;
		this.ngayHH=ngayHH;
	}
	public void nhap()
	{
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ngay san xuat");
		ngaySX=sc.nextInt();
		System.out.println("Nhap ngay het han");
		ngayHH=sc.nextInt();
	}
	public void xuat()
	{
		super.xuat();
		System.out.println("Ngay san xuat la "+ ngaySX);
		System.out.println("Nhay het han la" +ngayHH);
	}
}
class DSHangHoa
{
	HangHoa[] hh=new HangHoa[100];
	private static int soLuong=0;
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua mang");
		soLuong=sc.nextInt();
		byte chon;
		for(int i=0;i<soLuong;i++)
		{
			System.out.println("Chon Mat Hang");
			System.out.println("1.Dien May \n2.Thuc Pham");
			chon=sc.nextByte();
			if(chon==1)
			{
				hh[i]=new HangDM();
				hh[i].nhap();
			}
			if(chon==2)
			{
				hh[i]=new HangTP();
				hh[i].nhap();
			}
			
		}	
	}
	public void xuat()
	{
		for(int i=0;i<soLuong;i++)
		{
			hh[i].xuat();
		}
	}
	public void themMH(HangHoa mh)
	{
		hh[soLuong]=mh;
		soLuong++;
			
	}
	public void xuatDSTheoLoai(byte loai)
	{
	
		{
			for(int i=0;i<soLuong;i++)
			{
				if(loai==1)
				{
					if(hh[i] instanceof HangDM)
					{
						System.out.println("San pham thu "+(i+1));
						hh[i].xuat();
					}
				}
				else
				{

					if(hh[i] instanceof HangTP)
					{
						System.out.println("San pham thu "+(i+1));
						hh[i].xuat();
					}
				}
			}
		}
	}
	
}
