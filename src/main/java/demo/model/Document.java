package demo.model;

import java.io.InputStream;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="DOCUMENT")
public class Document {
		
		@Id 
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		@Lob
		private InputStream documnet;
		
		private String fileName;
		
		@Column
		@Temporal(TemporalType.DATE)
		private Date lastupdate;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public InputStream getDocumnet() {
			return documnet;
		}
		public void setDocumnet(InputStream documnet) {
			this.documnet = documnet;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public Date getLastupdate() {
			return lastupdate;
		}
		public void setLastupdate(Date lastupdate) {
			this.lastupdate = lastupdate;
		}
		
		
		

}
