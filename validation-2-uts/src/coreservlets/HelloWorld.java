package coreservlets;

import java.util.Arrays;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;

import coreservlets.DateUtils;

import java.util.Date;

@Named
@RequestScoped 
@ManagedBean
public class HelloWorld {
    private String input;
    private String namaDpn;
    private String namaBlkg;
    private String alamatJln;
    private String namaKota, negaraBagian, kodePos, noTelp, eMail;
    private String dropAsk;
    private String komentar;
    private String sukses = "sukses";
    private String[] cekLokasi;
    private String respon_no_lokasi = "Tidak Ada.";
    private String[] favNumber1;
    private Date tglSurvei;
    
    private String attractAsk;
    private String output;
    private String output2, output3;
    private String respon_sukses;
    private String rendered = "false";
    
    
    public void submit2() {
        output = "Nama Anda : " + namaDpn + " " + namaBlkg +", anda tinggal di " + alamatJln + " kode Pos " + kodePos + ", " + namaKota + ", " + negaraBagian + 
        		". Anda mengetahui dan tertarik dengan UNDIP melalui : "+ attractAsk + " dan anda " + dropAsk + " untuk merekomendasikan UNDIP";
        output2 = "Hal yang anda sukai dari UNDIP : " ;
        output3 = "Nomor anda yang dapat dihubungi : " + noTelp + " dan email yang masih aktif : " + eMail;
        respon_sukses = "Tanggapan anda telah direkam pada " + tglSurvei;
        rendered = "true";
    }
    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public String getOutput() {
        return output;
    }
    public String getOutput2() {
        return output2;
    }
    public String getOutput3() {
        return output3;
    }
    public String getrespon_sukses() {
        return respon_sukses;
    }
    
    public String cancel() {
    	this.namaDpn = "";
    	this.namaBlkg = "";
    	this.alamatJln = "";
    	this.namaKota = "";
    	this.negaraBagian = "";
    	this.kodePos = "";
    	this.noTelp = "";
    	this.eMail = "";
    	favNumber1 = null;
    	this.tglSurvei = null;
    	this.attractAsk = null;
    	this.dropAsk = null;
    	this.komentar = "";
    	return "xhtml/hello.xhtml?faces-redirect=true";
    }


    public String getNamaDpn() {
		return namaDpn;
	}

	public void setNamaDpn(String namaDpn) {
		this.namaDpn = namaDpn;
	}

	public String getNamaBlkg() {
		return namaBlkg;
	}

	public void setNamaBlkg(String namaBlkg) {
		this.namaBlkg = namaBlkg;
	}

	public String getAlamatJln() {
		return alamatJln;
	}

	public void setAlamatJln(String alamatJln) {
		this.alamatJln = alamatJln;
	}

    public String getNamaKota() {
		return namaKota;
	}

	public void setNamaKota(String namaKota) {
		this.namaKota = namaKota;
	}

	public String getNegaraBagian() {
		return negaraBagian;
	}

	public void setNegaraBagian(String negaraBagian) {
		this.negaraBagian = negaraBagian;
	}
	
	public String getKodePos() {
		return kodePos;
	}

	public void setKodePos(String kodePos) {
		this.kodePos = kodePos;
	}

	public String getNoTelp() {
		return noTelp;
	}

	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Date getTglSurvei() {
		if (tglSurvei == null) {
		      tglSurvei = new Date();
		    }
		    return(tglSurvei);
		  }

	public void setTglSurvei(Date tglSurvei) {
		this.tglSurvei = tglSurvei;
	}
	
	public String getTglSurvey() {
	    return(DateUtils.formatDay(tglSurvei));
	}

	public String[] getFavNumber1() {
        return favNumber1;
      }
      public void setFavNumber1(String[] favNumber1) {
        this.favNumber1 = favNumber1;
      }

      public String getFavNumber1InString() {
        if (favNumber1 == null || favNumber1.length == 0) {
        	return respon_no_lokasi;
        }
        else {
        	return Arrays.toString(favNumber1).replaceAll("[\\[.\\]]", "");
        }
      }
      
    
    
    public String getAttractAsk() {
		return attractAsk;
	}

	public void setAttractAsk(String attractAsk) {
		this.attractAsk = attractAsk;
	}

    public String getdropAsk() {
        return dropAsk;
    }
    public void setdropAsk(String dropAsk) {
        this.dropAsk = dropAsk;
    }

    public String getkomentar() {
        return komentar;
    }
    public void setkomentar(String komentar) {
        this.komentar = komentar;
    }
    
    public String getrendered() {
        return rendered;
    }
    public void setrendered(String rendered) {
        this.rendered = rendered;
    }
    
    public String getsukses() {
        return sukses;
    }
    public void setsukses(String sukses) {
        this.sukses = sukses;
    }
    
}