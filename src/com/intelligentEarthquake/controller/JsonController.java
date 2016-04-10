package com.intelligentEarthquake.controller;

import com.intelligentEarthquake.dao.CrawlerDAO;
import com.intelligentEarthquake.dao.LeftNavDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by FLY on 2016/2/18 0018.
 */

@Controller
public class JsonController {
    @Inject
    CrawlerDAO crawlerDAO;
    @Inject
    LeftNavDAO leftNavDAO;
    @RequestMapping({"/{var}.json"})
    public void showJson(HttpServletResponse response, @PathVariable String var) {
        System.out.println(var);
        response.setCharacterEncoding("utf-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        String json="";
        String hql = "from CrawlerEntity";
        switch (var){
            case "index":
                json=index;
                break;
            case "detail":
                json=detail;
                break;
            case "list":
                json=list;
                break;
        }
        try {
            response.getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String index = "{\"item\":[\"法律法规\",\"行业动态\",\"监测预报\",\"科技检测\",\"热点报道\",\"新闻资讯\"]}";
    private String detail = "{\"detail\":{\n" +
            "  \"id\" : \"123\",\n" +
            "  \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "  \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "  \"content\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "}}";
    private String list = "{\n" +
            "  \"list\": [\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"ttt建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"43建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"5建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"3建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\" : \"123\",\n" +
            "      \"title\": \"建设工程抗震设防要求管理规定\",\n" +
            "      \"info\": \"建设工程抗震设防要求管理规定 发布时间：2009-04-27\",\n" +
            "      \"abstract\": \"青海玉树7.1级地震发生后，中国地震局按照《中华人民共和国防震减灾法》的相关规定，组织全国地震区划图编制委员会对灾区地震动参数开展了专门研究。编委会在前期工作的基础上，进一步'+对青海玉树地震的发震构造、地震活动特征和震害特征开展了深入研究，并结合地震现场工作队的科学考察，通过分析计算给出了灾区范围内的地震动参数，编制了1:100万《青海、四川部分地区地震动峰值加速度区划图》和《青海、四川部分地区地震动反应谱特征周期区划图》。该研究结果已于2010年5月7日通过了全国地震标准化技术委员会和国家地震安全性评定委员会的联合审查，并作为《中国地震动参数区划图》国家标准的修改内容，由中国地震局报请国家标准化管理委员会批准发布。为了配合青海玉树地震灾区的恢复重建，国家标准化管理委员会启动了国家标准制修订快速程序，\"\n" +
            "    }\n" +
            "  ]}";
}
