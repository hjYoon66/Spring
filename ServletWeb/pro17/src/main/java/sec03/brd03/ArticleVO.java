package sec03.brd03;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ArticleVO {
    private int level;
    private int articleNo;
    private int parentNo;
    private String title;
    private String content;
    private String imageFileName;
    private String id;
    private Date writeDate;

    public ArticleVO(int level, int articleNo, int parentNo, String title, String content, String imageFileName, String id) {
        this.level = level;
        this.articleNo = articleNo;
        this.parentNo = parentNo;
        this.title = title;
        this.content = content;
        this.imageFileName = imageFileName;
        this.id = id;
    }
    public String getImageFileName() {
        try {
            if (imageFileName != null && imageFileName.length() != 0) {
                imageFileName = URLDecoder.decode(imageFileName, "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        try {
            if (imageFileName != null && imageFileName.length() != 0) {
                this.imageFileName = URLEncoder.encode(imageFileName, "UTF-8");//파일이름에 특수문자가 있을 경우 인코딩합니다.
            }else {
                this.imageFileName = imageFileName;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
