package com.cclinux.framework.helper;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;

/**
 * @Notes: 测试库
 * @Author: cclinux0730 (weixin)
 * @Date: 2024/12/18 12:41
 * @Ver: ccminicloud-framework 3.2.1
 */


public class FakerHelper {

    /**
     * 省份
     */
    public static String getProvince() {
        String[] data = {"北京市", "天津市", "河北省", "山西省",
                "内蒙古自治区", "辽宁省", "吉林省",
                "黑龙江省", "上海市", "江苏省",
                "浙江省", "安徽省", "福建省", "江西省",
                "山东省", "河南省", "湖北省", "湖南省",
                "广东省", "广西壮族自治区", "海南省",
                "重庆市", "四川省", "贵州省", "云南省",
                "西藏自治区", "陕西省", "甘肃省", "青海省",
                "宁夏回族自治区", "新疆维吾尔自治区",
                "香港特别行政区", "澳门特别行政区", "台湾省"
        };
        return RandomUtil.randomEle(data);
    }

    /**
     * 城市
     */
    public static String getCity() {
        String[] data = {"北京", "上海", "天津", "重庆",
                "哈尔滨", "长春", "沈阳", "呼和浩特",
                "石家庄", "乌鲁木齐", "兰州", "西宁",
                "西安", "银川", "郑州", "济南",
                "太原", "合肥", "武汉", "长沙",
                "南京", "成都", "贵阳", "昆明",
                "南宁", "拉萨", "杭州", "南昌",
                "广州", "福州", "海口",
                "香港", "澳门"
        };
        return RandomUtil.randomEle(data);
    }

    /**
     * 获得姓名
     */
    public static String getFirstName() {
        String[] data = {"李", "王", "张", "刘", "陈", "杨", "赵", "黄", "周", "吴",
                "徐", "孙", "胡", "朱", "高", "林", "何", "郭", "马", "罗",
                "梁", "宋", "郑", "谢", "韩", "唐", "冯", "于", "董", "萧",
                "程", "曹", "袁", "邓", "许", "傅", "沉", "曾", "彭", "吕",
                "苏", "卢", "蒋", "蔡", "贾", "丁", "林", "薛", "叶", "阎",
                "余", "潘", "杜", "戴", "夏", "钟", "汪", "田", "任", "姜",
                "范", "方", "石", "姚", "谭", "廖", "邹", "熊", "金", "陆",
                "郝", "孔", "白", "崔", "康", "毛", "邱", "秦", "江", "史",
                "顾", "侯", "邵", "孟", "龙", "万", "段", "雷", "钱", "汤",
                "尹", "黎", "易", "常", "武", "乔", "贺", "赖", "龚", "文",
                "庞", "樊", "兰", "殷", "施", "陶", "洪", "翟", "安", "颜",
                "倪", "严", "牛", "温", "芦", "季", "俞", "章", "鲁", "葛",
                "伍", "韦", "申", "尤", "毕", "聂", "丛", "焦", "向", "柳",
                "邢", "路", "岳", "齐", "沿", "梅", "莫", "庄", "辛", "管",
                "祝", "左", "涂", "谷", "祁", "时", "舒", "耿", "牟", "卜",
                "路", "詹", "关", "苗", "凌", "费", "纪", "靳", "盛", "童",
                "欧", "甄", "项", "曲", "成", "游", "阳", "裴", "席", "卫",
                "查", "屈", "鲍", "位", "覃", "霍", "翁", "隋", "植", "甘",
                "景", "薄", "单", "包", "司", "柏", "宁", "柯", "阮", "桂",
                "闵", "欧阳", "解", "强", "柴", "华", "车", "冉", "房", "边",
                "辜", "吉", "饶", "刁", "瞿", "戚", "丘", "古", "米", "池",
                "滕", "晋", "苑", "邬", "臧", "畅", "宫", "来", "嵺", "苟",
                "全", "褚", "廉", "简", "娄", "盖", "符", "奚", "木", "穆",
                "党", "燕", "郎", "邸", "冀", "谈", "姬", "屠", "连", "郜",
                "晏", "栾", "郁", "商", "蒙", "计", "喻", "揭", "窦", "迟",
                "宇", "敖", "糜", "鄢", "冷", "卓", "花", "仇", "艾", "蓝",
                "都", "巩", "稽", "井", "练", "仲", "乐", "虞", "卞", "封",
                "竺", "冼", "原", "官", "衣", "楚", "佟", "栗", "匡", "宗",
                "应", "台", "巫", "鞠", "僧", "桑", "荆", "谌", "银", "扬",
                "明", "沙", "薄", "伏", "岑", "习", "胥", "保", "和", "蔺"
        };
        return RandomUtil.randomEle(data);
    }


    /**
     * 女生名
     */
    public static String getFemaleName() {

        String[] data = {"芳", "娜", "敏", "静", "敏静", "秀英", "丽", "洋", "艳", "娟",
                "文娟", "君", "文君", "珺", "霞", "明霞", "秀兰", "燕", "芬", "桂芬",
                "玲", "桂英", "丹", "萍", "华", "红", "玉兰", "桂兰", "英", "梅",
                "莉", "秀珍", "雪", "依琳", "旭", "宁", "婷", "馨予", "玉珍", "凤英",
                "晶", "欢", "玉英", "颖", "红梅", "佳", "倩", "琴", "兰英", "云",
                "洁", "爱华", "淑珍", "春梅", "海燕", "晨", "冬梅", "秀荣", "瑞", "桂珍",
                "莹", "秀云", "桂荣", "秀梅", "丽娟", "婷婷", "玉华", "琳", "雪梅", "淑兰",
                "丽丽", "玉", "秀芳", "欣", "淑英", "桂芳", "丽华", "丹丹", "桂香", "淑华",
                "秀华", "桂芝", "小红", "金凤", "文", "利", "楠", "红霞", "瑜", "桂花",
                "璐", "凤兰", "腊梅", "瑶", "嘉", "怡", "冰冰", "玉梅", "慧", "婕"
        };
        return getFirstName() + RandomUtil.randomEle(data);
    }

    /**
     * 男生名
     */
    public static String getMaleName() {

        String[] data = {"伟", "强", "磊", "洋", "勇", "军", "杰", "涛", "超", "明",
                "刚", "平", "辉", "鹏", "华", "飞", "鑫", "波", "斌", "宇",
                "浩", "凯", "健", "俊", "帆", "帅", "旭", "宁", "龙", "林",
                "欢", "阳", "建华", "亮", "成", "畅", "建", "峰", "建国", "建军",
                "晨", "瑞", "志强", "兵", "雷", "东", "欣", "博", "彬", "坤",
                "全安", "荣", "岩", "杨", "文", "利", "楠", "建平", "嘉俊", "晧",
                "建明", "子安", "新华", "鹏程", "学明", "博涛", "捷", "文彬", "楼", "鹰",
                "松", "伦", "超", "钟", "瑜", "振国", "洪", "毅", "昱然", "哲",
                "翔", "翼", "祥", "国庆", "哲彦", "正诚", "正豪", "正平", "正业", "志诚",
                "志新", "志勇", "志明", "志强", "志文", "致远", "智明", "智勇", "智敏", "智渊"
        };
        return getFirstName() + RandomUtil.randomEle(data);
    }

    /**
     * 随机获得姓名
     */
    public static String getName() {

        int rd = RandomUtil.randomInt();
        return (rd % 2 == 0) ? getFemaleName() : getMaleName();
    }

    /**
     * 手机号码
     */
    public static String getMobile() {
        String[] data = {"133", "149", "153", "173", "177", "180", "181", "189", "190", "191", "193", "199", "130", "131", "132", "145", "155", "156", "166", "167", "171", "175", "176", "185", "186", "196", "134", "135", "136", "137", "138", "139", "147", "148", "150", "151", "152", "157", "158", "159", "172", "178", "182", "183", "184", "187", "188", "195", "197", "198"};

        return RandomUtil.randomEle(data) + RandomUtil.randomNumbers(8);
    }

    /**
     * 生日
     */
    public static String getBirth(String start, String end) {
        if (StrUtil.isEmpty(start)) start = "1900";
        if (StrUtil.isEmpty(end)) end = "2020";

        start = start + "-01-01 00:00:00";
        long startT = TimeHelper.time2Timestamp(start);

        end = end + "-12-31 23:59:59";
        long endT = TimeHelper.time2Timestamp(end);

        long time = RandomUtil.randomLong(startT, endT);

        return TimeHelper.timestamp2Time(time, "yyyy-MM-dd");
    }

    /**
     * 学院
     */
    public static String getCollege() {
        String data = "地球科学学院,环境科学与工程学院,化学与生物工程学院,材料科学与工程学院,土木与建筑工程学院,测绘地理信息学院,信息科学与工程学院,机械与控制工程学院,珠宝学院,马克思主义学院," +
                "公共管理与传媒学院,商学院,旅游与风景园林学院,艺术学院,外国语学院,理学院,文学与新闻传播学院,外国语学院,建筑与艺术学院,商学院,法学院,马克思主义学院,公共管理学院,数学与统计学院,物理与电子学院,化学化工学院,文学系,法学系,哲学系,医学系,力学系,理学系,数学系,物理系,化学系,计算机系,自动化系,口腔医学系,英语系,外语系,法语系,德语系,日语系,西班牙语系";
        String[] arr = data.split(",");

        return RandomUtil.randomEle(arr);
    }

    /**
     * 专业
     */
    public static String getMajor() {
        String data = "音乐表演,音乐学,作曲与作曲技术理论,舞蹈表演,舞蹈学,舞蹈编导,舞蹈教育,航空服务艺术与管理,流行音乐,音乐治疗,流行舞蹈,表演,戏剧学,电影学,戏剧影视文学,广播电视编导," +
                "戏剧影视导演,戏剧影视美术设计,录音艺术,播音与主持艺术,动画,美术学,绘画,雕塑,摄影,书法学,中国画,实验艺术,跨媒体艺术,文物保护与修复,漫画,艺术设计学,视觉传达设计,环境设计,产品设计,服装与服饰设计,公共艺术,工艺美术,数字媒体艺术,艺术与科技,陶瓷艺术设计,新媒体设计,包装设计,教育学,科学教育,人文教育,教育技术学,艺术教育,学前教育,小学教育,特殊教育,华文教育,教育康复学,卫生教育,法学,知识产权,监狱学,信用风险管理与法律防控,国际经贸规则,司法警察学,社区矫正,工商管理,市场营销,会计学,财务管理,国际商务,人力资源管理,审计学,资产评估,物业管理,文化产业管理,劳动关系,体育经济与管理,财务会计教育,市场营销教育,零售业管理,农林经济管理,农村区域发展 ,公共事业管理,行政管理,劳动与社会保障,土地资源管理,城市管理,海关管理,交通管理,海事管理,公共关系学,健康服务与管理,海警后勤管理,数学与应用数学,信息与计算科学,数理基础科学,数据计算及应用 ,物理学,应用物理学,核物理,声学,系统科学与工程,地理科学,自然地理与资源环境,人文地理与城乡规划,地理信息科学 ,机械设计制造及其自动化,材料成型及控制工程,机械电子工程,工业设计,过程装备与控制工程,车辆工程,汽车服务工程,机械工艺技术,微机电系统工程,机电技术教育,汽车维修工程教育,智能制造工程,材料科学与工程材料物理,材料化学,冶金工程,金属材料工程,无机非金属材料工程,高分子材料与工程,复合材料与工程,粉体材料科学与工程,宝石及材料工艺学,焊接技术与工程,功能材料,纳米材料与技术,新能源材料与器件,材料设计科学与工程,光电信息科学与工程,信息工程,广播电视工程,水声工程,电子封装技术,集成电路设计与集成系统,医学信息工程,电磁场与无线技术,电波传播与天线,电子信息科学与技术,电信工程及管理,应用电子技术教育,数字媒体技术,智能科学与技术,空间信息与数字技术,电子与计算机工程,数据科学与大数据技术,网络空间安全,新媒体技术,电影制作,保密技术,服务科学与工程,虚拟现实技术,区块链工程,建筑环境与能源应用工程,给排水科学与工程,建筑电气与智能化,城市地下空间工程,道路桥梁与渡河工程,铁道工程,智能建造,土木、水利与海洋工程,土木、水利与交通工程,采矿工程,石油工程,矿物加工工程,油气储运工程,矿物资源工程,海洋油气工程 ,纺织工程,服装设计与工程,非织造材料与工程,服装设计与工艺教育,丝绸设计与工程";

        String[] arr = data.split(",");

        return RandomUtil.randomEle(arr);
    }

    /**
     * 行业
     */
    public static String getTrade() {
        String[] data = {"经营", "销售", "市场营销", "公关", "客户服务", "人力资源", "行政HR", "财务/审计/统计", "文职", "翻译", "计算机/IT", "电子/通讯", "设计", "工业/工厂", "金融/经济", "法律", "机械", "技工", "房地产/土建", "咨询/顾问", "医疗/护理/保健", "服务业", "政府机关", "事业单位", "学生/研究生", "化工", "冶金/地质"};

        return RandomUtil.randomEle(data);
    }

    /**
     * 学历
     */
    public static String getEdu() {
        String data = "中学,高职,大专,本科,硕士,博士,博士后,其他";
        String[] arr = data.split(",");

        return RandomUtil.randomEle(arr);
    }


    /**
     * 性别
     */
    public static String getSex() {
        String data = "男,女";
        String[] arr = data.split(",");

        return RandomUtil.randomEle(arr);
    }

    /**
     * 职位
     */
    public static String getDuty() {
        String data = "CTO,CEO,CFO,研发,销售,采购,董事长,老板,自由自由者,中层领导,部门经理,大区经理";

        String[] arr = data.split(",");

        return RandomUtil.randomEle(arr);
    }

    /**
     * 资源
     */
    public static String getResource() {
        String data = "法律咨询,管理咨询,企业辅导,上市辅导,创业交流,投资融资,医疗咨询,教育交流,开发技术交流,研发交流,未来探讨,大宗商品,销售网络共享,艺术品鉴赏,供应链共享,进修交流,财会督导," +
                "审计辅导,企业治理,工程监理,硬件生产,小商品生产,电商,二类电商,早教,公考,艺术设计,人力资源,地质勘探,招工招聘,游戏开发,销售采购,市场营销,电子通讯,经济探讨,机械制造,产业经理,轻工业,化工化学,海外电商,企业出海,翻译,心理咨询,餐饮酒店,民宿,旅游自驾,服务业,租车,自媒体新媒体行业,文职人员,军迷,学习共勉,体育活动,打球约饭,户外旅行,文艺青年,小镇青年,斜杠青年,交通运输,民航机票,系统集成,售前服务,维修";

        String[] arr = data.split(",");

        return RandomUtil.randomEle(arr);
    }

    /**
     * 自我介绍
     */
    public static String getMotto() {
        String data = "生无一锥土，常有四海心 ,志在山顶的人，不会贪念山腰的风景 ,人之所以能，是相信能 ,卒子过河，意在吃帅 ,心志要坚，意趣要乐 ,贫困教会贫困者一切 ,欲望以提升热忱，毅力以磨平高山 ," +
                "人生不得行胸怀，虽寿百岁犹为无也 ,人之所以异于禽者，唯志而已矣！,每一发奋努力的背后，必有加倍的赏赐 ,治天下者必先立其志 ,以天下为己任 ,一人立志，万夫莫敌 ,志高山峰矮，路从脚下伸 ,鹰爱高飞，鸦栖一枝 ,莫为一身之谋，而有天下之志 ,人之所以能，是相信能,励志短语,没有天生的信心，只有不断培养的信心 ,世上没有绝望的处境，只有对处境绝望的人 ,人格的完善是本，财富的确立是末 ,在年轻人的颈项上，没有什么东西能比事业心这颗灿烂的宝珠 ,壮志与毅力是事业的双翼 ,心有多大，舞台就有多大 ,志正则众邪不生 ,母鸡的理想不过是一把糠 ,死犹未肯输心去，贫亦其能奈我何！,鸟贵有翼，人贵有志 ,有志登山顶，无志站山脚 ,没有一种不通过蔑视忍受和奋斗就可以征服的命运 ,远大的希望造就伟大的人物 ,志不立，天下无可成之事 ,有志者能使石头长出青草来 ,莫找借口失败，只找理由成功 ,男子千年志，吾生未有涯 ,鱼跳龙门往上游 ,有志者，事竟成  ,强行者有志 ,心随朗月高，志与秋霜洁 ,与其当一辈子乌鸦，莫如当一次鹰 ,石看纹理山看脉，人看志气树看材 ,志当存高远 ,任何的限制，都是从自己的内心开始的 ,志，气之帅也 ,一个人如果胸无大志，既使再有壮丽的举动也称不上是伟人  ,立志是事业的大门，工作是登门入室的旅程 ,志气和贫困是患难兄弟，世人常见他们伴在一起 ,失败是成功之母 ,对的，坚持；错的，放弃！,丈夫志不大，何以佐乾坤 ,鸭仔无娘也长大，几多白手也成家  ,我走得很慢，但是我从来不会后退,面对太阳，阴影将落在你的背后,困境之中，饱含机遇,执着于理想，纯粹于当下,不要轻言放弃，否则对不起自己,含泪播种的人一定能含笑收获,日益努力，而后风生水起,若要梦想实现，先从梦中醒来,今天比昨天好，就是希望,希望叫醒你的不是闹钟而是理想,坚定信念的人都是英雄,欲戴皇冠，必承其重,昨日之深渊，来日之浅谈,天越黑，星星越亮,岂能尽如人意，但求无愧我心,世上没什么运气，只有努力去挑战,日出之美便在于它脱胎于最深的黑暗,不要等待机会，而要创造机会,成功的秘诀在于对目标的执着追求,我把苦难挫折当作自己生存的最好导师,黑夜无论怎样悠长，白昼总会到来,海到无边天作岸，山登绝顶我为峰,除了放弃尝试以外没有失败,有梦就别怕痛，想赢就别喊停, 与其羡慕别人，不如自己努力,努力就能成功，坚持确保胜利,永不言败，是成功者的最佳品格,人生没有彩排，每天都是现场直播,火把倒下，火焰依然向上,低头哭过别忘了抬头继续走,有种脾气叫不放弃,风乍起，合当奋意向人生,莫问收获，但问耕耘,即使身在生活，也要做你理想的卧底,我只身前行，却仿佛带着一万雄兵,熬过一切，星光璀璨,没有人帮你，说明你一个人可以,让理想生活的样子清晰可见,趁我们头脑发热，我们要不顾一切,念念不忘，必有回响,一生很短，你要大胆,容易走的路，一般都很拥挤,那些杀不死我们的，终将让我们更强大,你利用时间的方式，就是塑造自己的方式,每一个不曾起舞的日子，都是对生命的辜负,猛兽总是独行，牛羊才成群结队,你迷茫的原因在于读书太少而想的太多,对未来真正的慷慨，是把一切献给现在,没有一点儿疯狂，生活就不值得过,生活在阴沟里，但仍有人仰望星空,怕输的人已经输了,不要忘记人生是要战斗到死, 抱怨身处黑暗，不如提灯前行,患难困苦，是磨炼人格之高等学校,失败不是悲剧，放弃才是,画工须画云中龙，为人须为人中雄,博观而约取，厚积而薄发,志在山顶的人，不会贪恋山腰的风景,别为失败找理由，要为成功找方法,迷失的时候，选择更艰辛的那条路,命是弱者的借口，运是强者的谦词,如果今天不走的话，明天就要跑,今天度过的一天明天就找不回来了,生活绝不会因为你胆小怯懦而饶过你,最可怕的敌人，就是没有坚强的信念,梦想一旦被付诸行动，就会变得神圣,寄言燕雀莫相唣，自有云霄万里高,人若有志，万事可为,志不可一日坠，人不可一日放,苦难，是化了妆的祝福,没有实力的愤怒毫无意义,在避风的港湾里，找不到昂扬的帆,大胆的尝试只等于成功了一半,天才就是无止境刻苦勤奋的能力,你是自己人生的设计师,苦想没盼头，苦干有奔头,世界会向那些有目标和远见的人让路,挫折其实就是迈向成功所应缴的学费,欲望以提升热忱，毅力以磨平高山,用行动祈祷比用言语更能够使上帝了解,志不立，天下无可成之事,志向和热爱是伟大行为的双翼,水激石则鸣，人激志则宏,雄心壮志是茫茫黑夜中的北斗星,贫而懒惰乃真穷，贱而无志乃真贱,目标越接近，困难越增加,绳锯木断，水滴石穿,男儿不展风云志，空负天生八尺躯,天才就是无止境刻苦勤奋的能力,苦难是人生的老师,成功的秘诀，在永不改变既定的目的,平凡的脚步也可以走完伟大的行程,如果你有梦想的话，就要去捍卫它,永远要面对眼前的这些困境,如果我放弃，就是向那些错看我的人屈服,运气，就是机会碰巧撞到了你的努力,哪有什么胜利可言，挺住就意味着一切,过去属于死神，未来属于你自己,失败是坚忍的最后考验,流水在碰到底处时才会释放活力";

        String[] arr = data.split(",");

        return RandomUtil.randomEle(arr);
    }


    /**
     * 用户头像
     */
    public static String getAvatar() {
        return "https://7265-release-7g51ulsq6451a0a6-1304820041.tcb.qcloud.la/mini/user_pic/" + RandomUtil.randomInt(1,
                200) + ".jpg";
    }


    /**
     * 常用英文单词
     */
    public static String getEnWord() {
        String data = "earthday,org,suggests,that,every,household,take,time,this,earth,day,to,perform,a,plastic," +
                "audit,which,involves,counting,how,many,plastic,containers,wraps,bottles,and,bags,are,purchased,for,at,home,use,it,may,surprise,you,how,many,you,use,until,you,start,counting,while,were,not,saying,that,you,have,to,get,rid,of,every,single,ounce,of,plastic,in,your,home,it,is,important,to,be,aware,of,your,familys,plastic,usage,and,to,take,time,to,research,more,sustainable,products,and,start,to,incorporate,them,into,your,daily,life,simple,swaps2,like,glass,containers,instead,of,plastic,or,stainless3,steel,bottles,instead,of,single,use,plastics,can,go,a,long,way,to,making,a,difference";

        String[] arr = data.split(",");

        return RandomUtil.randomEle(arr);
    }

    /**
     * 以当天为基点，获取随机时间戳，默认为当天
     *
     * @param {*} min  起始
     * @param {*} max  终止
     */
    public static long getAddTimestamp(long min, long max) {
        String now = TimeHelper.timestamp2Time(TimeHelper.timestamp(), "yyyy-MM-dd"); //转为当天0点
        return TimeHelper.time2Timestamp(now) + RandomUtil.randomLong(min * 86400 * 1000, max * 86400 * 1000);
    }

}
