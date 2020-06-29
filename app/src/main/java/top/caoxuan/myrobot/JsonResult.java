package top.caoxuan.myrobot;

class JsonResult {
    static class Joke implements Result {
        private String title;
        private String content;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "标题：" + title + "\n" + "内容：" + content;
        }
    }

    static class GuanYin implements Result {
        private String number1;
        private String number2;
        private String haohua;
        private String qianyu;
        private String shiyi;
        private String jieqian;
        private String type;

        public String getNumber1() {
            return number1;
        }

        public void setNumber1(String number1) {
            this.number1 = number1;
        }

        public String getNumber2() {
            return number2;
        }

        public void setNumber2(String number2) {
            this.number2 = number2;
        }

        public String getHaohua() {
            return haohua;
        }

        public void setHaohua(String haohua) {
            this.haohua = haohua;
        }

        public String getQianyu() {
            return qianyu;
        }

        public void setQianyu(String qianyu) {
            this.qianyu = qianyu;
        }

        public String getShiyi() {
            return shiyi;
        }

        public void setShiyi(String shiyi) {
            this.shiyi = shiyi;
        }

        public String getJieqian() {
            return jieqian;
        }

        public void setJieqian(String jieqian) {
            this.jieqian = jieqian;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "您抽取的是第" + number1 + "签" + "\n" +
                    "签位：" + haohua + "\n" +
                    "签语：" + qianyu + "\n" +
                    "诗意：" + shiyi + "\n" +
                    "解签：" + jieqian + "\n";

        }
    }

    static class YueLao implements Result {
        private String number1;
        private String number2;
        private String haohua;
        private String shiyi;
        private String jieqian;
        private String zhushi;
        private String baihua;
        private String type;

        public String getNumber1() {
            return number1;
        }

        public void setNumber1(String number1) {
            this.number1 = number1;
        }

        public String getNumber2() {
            return number2;
        }

        public void setNumber2(String number2) {
            this.number2 = number2;
        }

        public String getHaohua() {
            return haohua;
        }

        public void setHaohua(String haohua) {
            this.haohua = haohua;
        }

        public String getShiyi() {
            return shiyi;
        }

        public void setShiyi(String shiyi) {
            this.shiyi = shiyi;
        }

        public String getJieqian() {
            return jieqian;
        }

        public void setJieqian(String jieqian) {
            this.jieqian = jieqian;
        }

        public String getZhushi() {
            return zhushi;
        }

        public void setZhushi(String zhushi) {
            this.zhushi = zhushi;
        }

        public String getBaihua() {
            return baihua;
        }

        public void setBaihua(String baihua) {
            this.baihua = baihua;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "您抽取的是第" + number1 + "签" + "\n" +
                    "签位：" + haohua + "\n" +
                    "诗意：" + shiyi + "\n" +
                    "解签：" + jieqian + "\n" +
                    "注释：" + zhushi + "\n" +
                    "签语：" + baihua + "\n";
        }
    }

    static class CaiShenYe implements Result {
        private String number1;
        private String number2;
        private String qianyu;
        private String zhushi;
        private String jieqian;
        private String jieshuo;
        private String jieguo;
        private String hunyin;
        private String shiye;
        private String gongming;
        private String shiwu;
        private String cwyj;
        private String liujia;
        private String qiucai;
        private String jiaoyi;
        private String jibin;
        private String susong;
        private String yuntu;
        private String moushi;
        private String hhzsy;
        private String type;

        public String getNumber1() {
            return number1;
        }

        public void setNumber1(String number1) {
            this.number1 = number1;
        }

        public String getNumber2() {
            return number2;
        }

        public void setNumber2(String number2) {
            this.number2 = number2;
        }

        public String getQianyu() {
            return qianyu;
        }

        public void setQianyu(String qianyu) {
            this.qianyu = qianyu;
        }

        public String getZhushi() {
            return zhushi;
        }

        public void setZhushi(String zhushi) {
            this.zhushi = zhushi;
        }

        public String getJieqian() {
            return jieqian;
        }

        public void setJieqian(String jieqian) {
            this.jieqian = jieqian;
        }

        public String getJieshuo() {
            return jieshuo;
        }

        public void setJieshuo(String jieshuo) {
            this.jieshuo = jieshuo;
        }

        public String getJieguo() {
            return jieguo;
        }

        public void setJieguo(String jieguo) {
            this.jieguo = jieguo;
        }

        public String getHunyin() {
            return hunyin;
        }

        public void setHunyin(String hunyin) {
            this.hunyin = hunyin;
        }

        public String getShiye() {
            return shiye;
        }

        public void setShiye(String shiye) {
            this.shiye = shiye;
        }

        public String getGongming() {
            return gongming;
        }

        public void setGongming(String gongming) {
            this.gongming = gongming;
        }

        public String getShiwu() {
            return shiwu;
        }

        public void setShiwu(String shiwu) {
            this.shiwu = shiwu;
        }

        public String getCwyj() {
            return cwyj;
        }

        public void setCwyj(String cwyj) {
            this.cwyj = cwyj;
        }

        public String getLiujia() {
            return liujia;
        }

        public void setLiujia(String liujia) {
            this.liujia = liujia;
        }

        public String getQiucai() {
            return qiucai;
        }

        public void setQiucai(String qiucai) {
            this.qiucai = qiucai;
        }

        public String getJiaoyi() {
            return jiaoyi;
        }

        public void setJiaoyi(String jiaoyi) {
            this.jiaoyi = jiaoyi;
        }

        public String getJibin() {
            return jibin;
        }

        public void setJibin(String jibin) {
            this.jibin = jibin;
        }

        public String getSusong() {
            return susong;
        }

        public void setSusong(String susong) {
            this.susong = susong;
        }

        public String getYuntu() {
            return yuntu;
        }

        public void setYuntu(String yuntu) {
            this.yuntu = yuntu;
        }

        public String getMoushi() {
            return moushi;
        }

        public void setMoushi(String moushi) {
            this.moushi = moushi;
        }

        public String getHhzsy() {
            return hhzsy;
        }

        public void setHhzsy(String hhzsy) {
            this.hhzsy = hhzsy;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "您抽取的是第" + number1 + "签" + "\n" +
                    "签语：" + qianyu + "\n" +
                    "注释：" + zhushi + "\n" +
                    "解签：" + jieqian + "\n" +
                    "解说：" + jieshuo + "\n" +
                    "结果：" + jieguo + "\n" +
                    "婚姻：" + hunyin + "\n" +
                    "事业：" + shiye + "\n" +
                    "功名：" + gongming + "\n" +
                    "失物：" + shiwu + "\n" +
                    "出外移居：" + cwyj + "\n" +
                    "六甲：" + liujia + "\n" +
                    "求财：" + qiucai + "\n" +
                    "交易：" + jiaoyi + "\n" +
                    "疾病：" + jibin + "\n" +
                    "诉讼：" + susong + "\n" +
                    "运途：" + yuntu + "\n" +
                    "某事：" + moushi + "\n" +
                    "合伙做生意：" + hhzsy + "\n";
        }
    }
}
