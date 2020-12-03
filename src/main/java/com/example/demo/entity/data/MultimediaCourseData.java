package com.example.demo.entity.data;

import java.util.List;

public class MultimediaCourseData {


    /**
     * id : squjp
     * created_at : 2019-07-05T06:03:43+00:00
     * updated_at : 2019-11-13T03:41:48+00:00
     * plan_id : exicx
     * title : 选词填空：常考点
     * video_type : 1
     * description : 今天我们将介绍选词填空中考查频率很高的五类考点，具体介绍每类考点的结构特征。在课上重点讲解了并列结构的作用，从词性和词义两方面确定空格处答案。此外，讲义中还提供了巩固课堂技巧的真题，帮助同学们掌握选词填空中常见结构的解题方法。【请结合讲义P36-37页使用】
     * exercise_url :
     * label : 1
     * course_subject_id : ksxwl
     * status : 1
     * skill : 选词填空-常考模式
     * cover_image_urls :["https://media-image1.baydn.com/preperation_pub_img/vjgafl/14478ccd39560d5a2daa0da6b11213a6.57d3daa6ffcd522be7261a684dba0e8f.png?x-oss-process=image/quality,Q_80","https://media-image1.baydn.com/preperation_pub_img/vjgafl/14478ccd39560d5a2daa0da6b11213a6.57d3daa6ffcd522be7261a684dba0e8f.png?x-oss-process=image/quality,Q_80"]
     *                    该地址为扇克英语的广告图
     * video_urls : ["https://media-video0.baydn.com/preparation_pri_vid/2cb8463450e10fafba01810a2ce70384.9e2949ce7e98acea5cb03c6e192593f3.mp4?auth_key=1574266883-0-0-f65b38dad3adeae299f179a0220d08a8","https://media-video0.baydn.com/preparation_pri_vid/2cb8463450e10fafba01810a2ce70384.9e2949ce7e98acea5cb03c6e192593f3.mp4?auth_key=1574266883-0-0-f65b38dad3adeae299f179a0220d08a8"]
     *              该属性已失效
     * focus_image_urls : ["https://media-image1.baydn.com/preparation-course.592310568.11.png?x-oss-process=image/quality,Q_80","https://media-image1.baydn.com/preparation-course.592310568.11.png?x-oss-process=image/quality,Q_80"]
     *                    该属性为视频课程重点截图
     * user_course : {"process":844,"status":1}
     * has_practice : 1
     * finish_ratio : 81.39%
     */

    private String id;
    private String created_at;
    private String updated_at;
    private String plan_id;
    private String title;
    private int video_type;
    private String description;
    private String exercise_url;
    private int label;
    private String course_subject_id;
    private int status;
    private String skill;
    /**
     * process : 844
     * status : 1
     */

    private UserCourseBean user_course;
    private int has_practice;
    private String finish_ratio;
    private List<String> cover_image_urls;
    private List<String> video_urls;
    private List<String> focus_image_urls;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVideo_type() {
        return video_type;
    }

    public void setVideo_type(int video_type) {
        this.video_type = video_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExercise_url() {
        return exercise_url;
    }

    public void setExercise_url(String exercise_url) {
        this.exercise_url = exercise_url;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public String getCourse_subject_id() {
        return course_subject_id;
    }

    public void setCourse_subject_id(String course_subject_id) {
        this.course_subject_id = course_subject_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public UserCourseBean getUser_course() {
        return user_course;
    }

    public void setUser_course(UserCourseBean user_course) {
        this.user_course = user_course;
    }

    public int getHas_practice() {
        return has_practice;
    }

    public void setHas_practice(int has_practice) {
        this.has_practice = has_practice;
    }

    public String getFinish_ratio() {
        return finish_ratio;
    }

    public void setFinish_ratio(String finish_ratio) {
        this.finish_ratio = finish_ratio;
    }

    public List<String> getCover_image_urls() {
        return cover_image_urls;
    }

    public void setCover_image_urls(List<String> cover_image_urls) {
        this.cover_image_urls = cover_image_urls;
    }

    public List<String> getVideo_urls() {
        return video_urls;
    }

    public void setVideo_urls(List<String> video_urls) {
        this.video_urls = video_urls;
    }

    public List<String> getFocus_image_urls() {
        return focus_image_urls;
    }

    public void setFocus_image_urls(List<String> focus_image_urls) {
        this.focus_image_urls = focus_image_urls;
    }

    public static class UserCourseBean {
        private int process;
        private int status;

        public int getProcess() {
            return process;
        }

        public void setProcess(int process) {
            this.process = process;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }
}
