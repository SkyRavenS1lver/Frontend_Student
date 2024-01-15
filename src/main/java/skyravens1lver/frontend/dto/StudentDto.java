package skyravens1lver.frontend.dto;

public class StudentDto {
	private long id;
	private String nim;
	private String nama;
	private int age;

	public StudentDto(long id, String nim, String nama, int age) {
		this.id = id;
		this.nim = nim;
		this.nama = nama;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
