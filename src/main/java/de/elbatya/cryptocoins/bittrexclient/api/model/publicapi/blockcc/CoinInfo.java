package de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author contact@elbatya.de
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinInfo {

    private String _id;//": "5ab3deadce79d2cf9b84cbaa",
    private String id;//": "pundi-x",
    private LocalDateTime createdAt;//": "2018-03-22T16:49:49.879Z",
    private LocalDateTime updatedAt;//": "2018-06-18T22:03:26.814Z",
    private String symbol;//": "NPXS",
    private String name;//": "Pundi X",
    private String from;//": "coinmarketcap,dataCenter",
    private String detail_url;//": "https://coinmarketcap.com/currencies/pundi-x/#CNY",
    private String keys;//": "Pundi X pundi-x PXS NPXS NPXS",
    private boolean isLegalCoin;//": false,
    private double change1d;//": 2.57,
    private double change1h;//": -2.12,
    private double change7d;//": 120.93,
    private double price;//": 0.0117793,
    private double volume_coin;//": 213428061.11,
    private double volume_ex;//": 2514033.160233023,
    private double supple;//": 68179231883,
    private String website;//": "https://pundix.com/",
    private String Explorer;//": "https://etherscan.io/token/0xa15c7ebe1f07caf6bff097d8a589fb8ac49ae5b3",
    private boolean isUpdated;//": true,
    private BigDecimal listingTime;//": 1521734400000,
    private boolean mineable;//": false,
    private String coin_chain;//": "ethereum",
    private String coin_type;//": "2",
    private int level;//": 29,
    private int volume_level;//": 162,
    private String status;//": "false",
    private String type;//": "",
    private BigDecimal publicTime;//": 1521763200000,
    private boolean isIncrease;//": false,
    private String country;//": "",
    private double marketCap;//": 728471586,
    private String github;//": "",
    private double available_supply;//": 61843368132,
    private int ex_num;//": 8,
    private double low1d;//": 0.00968069,
    private double high1d;//": 0.0125612,
    private double change30d;//": -2.48,
    private BigDecimal timestamps;//": 1529359351216,
    private String imgUrl;//": "https://blockchains.oss-cn-shanghai.aliyuncs.com/static/coinInfo/pundi-x.png",
    private boolean isUpdated1;//": true,
    private String whitepaper;//": "https://pundix.com/pdf/PundiX_WhitePaper_CN_FinalVer1.pdf",
    private CoinInfoIco ico;
    private List<CoinInfoExData> exData;
    private double CNY_RATE;//": 6.4388,
    private double BTC_RATE;//": 0.00014871,
    private double ETH_RATE;//": 0.00193381,
    private boolean hasKline;//": true,
    private boolean hasNotices;//": true,

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDetail_url() {
        return detail_url;
    }

    public void setDetail_url(String detail_url) {
        this.detail_url = detail_url;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public boolean isLegalCoin() {
        return isLegalCoin;
    }

    public void setLegalCoin(boolean legalCoin) {
        isLegalCoin = legalCoin;
    }

    public double getChange1d() {
        return change1d;
    }

    public void setChange1d(double change1d) {
        this.change1d = change1d;
    }

    public double getChange1h() {
        return change1h;
    }

    public void setChange1h(double change1h) {
        this.change1h = change1h;
    }

    public double getChange7d() {
        return change7d;
    }

    public void setChange7d(double change7d) {
        this.change7d = change7d;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume_coin() {
        return volume_coin;
    }

    public void setVolume_coin(double volume_coin) {
        this.volume_coin = volume_coin;
    }

    public double getVolume_ex() {
        return volume_ex;
    }

    public void setVolume_ex(double volume_ex) {
        this.volume_ex = volume_ex;
    }

    public double getSupple() {
        return supple;
    }

    public void setSupple(double supple) {
        this.supple = supple;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getExplorer() {
        return Explorer;
    }

    public void setExplorer(String explorer) {
        Explorer = explorer;
    }

    public boolean isUpdated() {
        return isUpdated;
    }

    public void setUpdated(boolean updated) {
        isUpdated = updated;
    }

    public BigDecimal getListingTime() {
        return listingTime;
    }

    public void setListingTime(BigDecimal listingTime) {
        this.listingTime = listingTime;
    }

    public boolean isMineable() {
        return mineable;
    }

    public void setMineable(boolean mineable) {
        this.mineable = mineable;
    }

    public String getCoin_chain() {
        return coin_chain;
    }

    public void setCoin_chain(String coin_chain) {
        this.coin_chain = coin_chain;
    }

    public String getCoin_type() {
        return coin_type;
    }

    public void setCoin_type(String coin_type) {
        this.coin_type = coin_type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVolume_level() {
        return volume_level;
    }

    public void setVolume_level(int volume_level) {
        this.volume_level = volume_level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(BigDecimal publicTime) {
        this.publicTime = publicTime;
    }

    public boolean isIncrease() {
        return isIncrease;
    }

    public void setIncrease(boolean increase) {
        isIncrease = increase;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public double getAvailable_supply() {
        return available_supply;
    }

    public void setAvailable_supply(double available_supply) {
        this.available_supply = available_supply;
    }

    public int getEx_num() {
        return ex_num;
    }

    public void setEx_num(int ex_num) {
        this.ex_num = ex_num;
    }

    public double getLow1d() {
        return low1d;
    }

    public void setLow1d(double low1d) {
        this.low1d = low1d;
    }

    public double getHigh1d() {
        return high1d;
    }

    public void setHigh1d(double high1d) {
        this.high1d = high1d;
    }

    public double getChange30d() {
        return change30d;
    }

    public void setChange30d(double change30d) {
        this.change30d = change30d;
    }

    public BigDecimal getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(BigDecimal timestamps) {
        this.timestamps = timestamps;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public boolean isUpdated1() {
        return isUpdated1;
    }

    public void setUpdated1(boolean updated1) {
        isUpdated1 = updated1;
    }

    public String getWhitepaper() {
        return whitepaper;
    }

    public void setWhitepaper(String whitepaper) {
        this.whitepaper = whitepaper;
    }

    public CoinInfoIco getIco() {
        return ico;
    }

    public void setIco(CoinInfoIco ico) {
        this.ico = ico;
    }

    public List<CoinInfoExData> getExData() {
        return exData;
    }

    public void setExData(List<CoinInfoExData> exData) {
        this.exData = exData;
    }

    public double getCNY_RATE() {
        return CNY_RATE;
    }

    public void setCNY_RATE(double CNY_RATE) {
        this.CNY_RATE = CNY_RATE;
    }

    public double getBTC_RATE() {
        return BTC_RATE;
    }

    public void setBTC_RATE(double BTC_RATE) {
        this.BTC_RATE = BTC_RATE;
    }

    public double getETH_RATE() {
        return ETH_RATE;
    }

    public void setETH_RATE(double ETH_RATE) {
        this.ETH_RATE = ETH_RATE;
    }

    public boolean isHasKline() {
        return hasKline;
    }

    public void setHasKline(boolean hasKline) {
        this.hasKline = hasKline;
    }

    public boolean isHasNotices() {
        return hasNotices;
    }

    public void setHasNotices(boolean hasNotices) {
        this.hasNotices = hasNotices;
    }

    //    {
//        "code": 0,
//            "message": "success",
//            "data": {
//        "descriptions": {
//            "zh": [
//            "QuarkChain 是基于分片技术的区块链底层技术方案，它具有安全、去中心化、高吞吐能力和可扩展的特性，它将实现每秒十万级链以上的交易处理能力（100,000+ TPS）。"
//      ],
//            "en": [
//            "QuarkChain is a blockchain underlying technology solution based on fragmentation technology. It is secure, decentralized, high-throughput, and scalable. It will achieve transaction processing capacity of more than 100,000 links per second (100,000+ TPS)."
//      ]
//        },
//        "twitter": {
//            "url": "https://twitter.com/Quark_Chain",
//                    "name": "Quark_Chain"
//        },
//        "reddit": {
//            "url": "https://www.reddit.com/r/QuarkChain/",
//                    "name": "QuarkChain"
//        },
//        "websites": [
//        "https://quarkchain.io"
//    ],
//        "Explorers": [
//        "https://etherscan.io/token/0xea26c4ac16d4a5a106820bc8aee85fd0b7b2b664",
//                "https://ethplorer.io/address/0xea26c4ac16d4a5a106820bc8aee85fd0b7b2b664"
//    ],
//        "telegram": [],
//        "message": [
//        "https://medium.com/@quarkchainquark"
//    ],
//        "editStatus": "1",
//                "Support": [
//        "5a224354f983571ddea58893",
//                "5a84ccd190b57c1a2fd98b00",
//                "5a224354f983571ddea58838",
//                "5a224354f983571ddea58810",
//                "5a224354f983571ddea58858",
//                "5a224354f983571ddea58891",
//                "5aa9f77f4240890cf54fce3d",
//                "5aa9eda55b21e46441296496",
//                "5b1fa4b8e14dd023b285efe7",
//                "5ad94a78df12346f4ff741ba",
//                "5ad980a2df12346f4ff74357"
//    ],
//        "support_exs": [],
//        "alias": [],
//        "exchangeInfo": [],
//        "suggest_ex": [
//        {
//            "_id": "5a224354f983571ddea58810",
//                "name": "binance",
//                "link": "https://www.binance.com/",
//                "zh_name": "币安",
//                "display_name": "Binance",
//                "isUpdate": true
//        },
//        {
//            "_id": "5ad94a78df12346f4ff741ba",
//                "name": "hotbit",
//                "link": "https://www.hotbit.io/",
//                "zh_name": "",
//                "display_name": "Hotbit",
//                "isUpdate": true
//        }
//    ],
//        "_id": "5b14de8a2eb56e4c1e583d56",
//                "imgUrl": "http://blockchains.oss-cn-shanghai.aliyuncs.com/static/coinInfo/quarkchain.png",
//                "id": "quarkchain",
//                "level": 199,
//                "change1d": -2.16,
//                "available_supply": 357431729,
//                "github": "https://github.com/QuarkChain",
//                "marketCap": 52241149,
//                "name": "QuarkChain",
//                "coin_type": "2",
//                "coin_chain": "",
//                "mineable": false,
//                "country": "",
//                "supple": 10000000000,
//                "isLegalCoin": false,
//                "isIncrease": false,
//                "publicTime": 1527921682000,
//                "from": "",
//                "detail_url": "https://coinmarketcap.com/currencies/quarkchain/#CNY",
//                "type": "",
//                "symbol": "QKC",
//                "price": 0.146157,
//                "website": "https://quarkchain.io/",
//                "Explorer": "https://etherscan.io/token/0xea26c4ac16d4a5a106820bc8aee85fd0b7b2b664",
//                "volume_ex": 13561947.96447711,
//                "listingTime": 1528041600000,
//                "keys": "qkc QKC QuarkChain quarkchain",
//                "status": "false",
//                "createdAt": "2018-06-04T06:39:06.823Z",
//                "updatedAt": "2018-06-14T13:38:29.390Z",
//                "volume_level": 54,
//                "whitepaper": "https://quarkchain.io/QUARK%20CHAIN%20Public%20Version%200.3.4.pdf",
//                "supply": 10000000000,
//                "low1d": 0.127758,
//                "high1d": 0.158431,
//                "volume_coin": 92790273.23,
//                "change30d": -51.72,
//                "change7d": -21.9,
//                "change1h": -2.32,
//                "timestamps": 1528983452747,
//                "ex_num": 11,
//                "isUpdated": true,
//                "outflow_1w": 58974364.089999996,
//                "inflow_1w": 57267013.12,
//                "outflow_1d": 4992060.66,
//                "inflow_1d": 4309148.29,
//                "outflow_1h": 124332.95000000001,
//                "inflow_1h": 191206.83,
//                "outflow_30m": 66973.66,
//                "inflow_30m": 97845.07999999999,
//                "isUpdated1": true,
//                "pairData": [
//        {
//            "name": "BTC",
//                "y": 8404826.779022023
//        },
//        {
//            "name": "ETH",
//                "y": 4104582.6506364644
//        },
//        {
//            "name": "USDT",
//                "y": 780853.637892
//        },
//        {
//            "name": "INR",
//                "y": 4559.342691041549
//        }
//    ],
//        "exData": [
//        {
//            "name": "Binance",
//                "y": 9649099.288417034
//        },
//        {
//            "name": "Hotbit",
//                "y": 2303197.0515742013
//        },
//        {
//            "name": "bgj.io",
//                "y": 555381.503532
//        },
//        {
//            "name": "Kucoin",
//                "y": 271832.56370660244
//        },
//        {
//            "name": "Gate.io",
//                "y": 253407.0877002255
//        },
//        {
//            "name": "LATOKEN",
//                "y": 215199.5666697562
//        },
//        {
//            "name": "IDEX",
//                "y": 39167.70089721064
//        },
//        {
//            "name": "Bitbns",
//                "y": 4559.342691041549
//        },
//        {
//            "name": "Bilaxy",
//                "y": 2967.0578006329874
//        },
//        {
//            "name": "other",
//                "y": 11.2472528262921
//        }
//    ],
//        "ico": {
//            "zh": {
//                "progress": [
//                {
//                    "_id": "5b14d7b7c1295b05da221c88",
//                        "description": "区块链可扩展性问题研究",
//                        "plan_time": 1498752000000,
//                        "finish_time": 1498752000000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c87",
//                        "description": "白皮书草案",
//                        "plan_time": 1509379200000,
//                        "finish_time": 1509379200000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c84",
//                        "description": "Testnet 1.0智能合约0.1",
//                        "plan_time": 1530288000000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c83",
//                        "description": "QuarkChain Core 1.0 Mainnet（",
//                        "plan_time": 1538236800000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c82",
//                        "description": "QuarkChain Core 1.0 Mainnet 1.0 SmartWallet 1.0",
//                        "plan_time": 1540915200000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c81",
//                        "description": "QuarkChain核心2.0 SmartWallet 2.0",
//                        "plan_time": 1561824000000
//                }
//        ],
//                "amount_ratio": [],
//                "description": "QuarkChain 是基于分片技术的区块链底层技术方案，它具有安全、去中心化、高吞吐能力和可扩展的特性，它将实现每秒十万级链以上的交易处理能力（100,000+ TPS）。",
//                        "risk": "0"
//            },
//            "en": {
//                "progress": [
//                {
//                    "_id": "5b14d7b7c1295b05da221c88",
//                        "description": "Blockchain Scalability Problem Research",
//                        "plan_time": 1498752000000,
//                        "finish_time": 1498752000000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c87",
//                        "description": "White Paper Draft",
//                        "plan_time": 1509379200000,
//                        "finish_time": 1509379200000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c84",
//                        "description": "Testnet 1.0 Smart Contract 0.1",
//                        "plan_time": 1530288000000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c83",
//                        "description": "QuarkChain Core 1.0 Mainnet (&quot;down quark&quot; chain 1.0) SmartWallet 1.0",
//                        "plan_time": 1538236800000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c82",
//                        "description": "QuarkChain Core 1.0 Mainnet 1.0 SmartWallet 1.0",
//                        "plan_time": 1540915200000
//                },
//                {
//                    "_id": "5b14d7b7c1295b05da221c81",
//                        "description": "QuarkChain Core 2.0 SmartWallet 2.0",
//                        "plan_time": 1561824000000
//                }
//        ],
//                "amount_ratio": [],
//                "description": "Because a super-full node can be extremely expensive when TPS goes high, we allow multiple honest nodes forming a cluster running as a super-full node.",
//                        "risk": "0"
//            },
//            "ico_coins": [
//            "ETH"
//      ],
//            "type_label": [
//            "Other"
//      ],
//            "hot_label": [],
//            "editStatus": "1",
//                    "team": [
//            {
//                "_id": "5b145e07c1295b05da1aa1b5",
//                    "name": "Qi Zhou",
//                    "job": "Founder",
//                    "linkedin": "http://linkedin.com/in/qi-zhou-9a668715",
//                    "job_zh": "Founder"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1b4",
//                    "name": "Zhaoguang Wang",
//                    "job": "Software Engineer",
//                    "linkedin": "https://www.linkedin.com/in/zhaoguang-wang-436b8029",
//                    "job_zh": "Software Engineer"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1b3",
//                    "name": "Xiaoli Ma",
//                    "job": "Research Scientist",
//                    "linkedin": "https://www.linkedin.com/in/xiaoli-ma-1524903",
//                    "job_zh": "Research Scientist"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1b2",
//                    "name": "Yang Ya Dong",
//                    "job": "Research Scientist",
//                    "linkedin": "https://www.linkedin.com/in/yaodong-yang-37804817",
//                    "job_zh": "Research Scientist"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1b1",
//                    "name": "Wencen Wu",
//                    "job": "Research Scientist",
//                    "linkedin": "https://www.linkedin.com/in/wencen-wu-8b924621/",
//                    "job_zh": "Research Scientist"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1b0",
//                    "name": "Anthurine Xiang",
//                    "job": "Marketing & Community",
//                    "linkedin": "https://www.linkedin.com/in/yazhenxiang/",
//                    "job_zh": "Marketing & Community"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1af",
//                    "name": "Ting Du",
//                    "job": "Business Development and Eco-system",
//                    "job_zh": "Business Development and Eco-system"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1ae",
//                    "name": "Patrick Mei",
//                    "job": "Community Manager",
//                    "linkedin": "https://www.linkedin.com/in/patrick-mei-059a77161",
//                    "job_zh": "Community Manager"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1ad",
//                    "name": "Julianne Zhu",
//                    "job": "Social Media Broadcasting",
//                    "linkedin": "https://www.linkedin.com/in/julianne-zhu-32017722/",
//                    "job_zh": "Social Media Broadcasting"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1ac",
//                    "name": "Arun Phadke"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1ab",
//                    "name": "Bill Moore"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1aa",
//                    "name": "Mike Miller"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1a9",
//                    "name": "Kevin Hsu"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1a8",
//                    "name": "Leo Wang"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1a7",
//                    "name": "Zhiyun Qian"
//            },
//            {
//                "_id": "5b145e07c1295b05da1aa1a6",
//                    "name": "Andrew Lee"
//            }
//      ],
//            "cooperation": [
//            {
//                "_id": "5af971e8b708365296f60364",
//                    "img": "https://icoholder.com/media/cache/member_thumb/files/img/b530d72caa5be98769689dd399063bb4.png",
//                    "description": null
//            },
//            {
//                "_id": "5af971e8b708365296f60363",
//                    "img": "https://icoholder.com/media/cache/member_thumb/files/img/b01f6e6b19d9baf15eab1385e8af9237.png",
//                    "description": null
//            },
//            {
//                "_id": "5af971e8b708365296f60362",
//                    "img": "https://icoholder.com/media/cache/member_thumb/files/img/e882453355dd0545414d7adfb831b0bd.png",
//                    "description": null
//            },
//            {
//                "_id": "5af971e8b708365296f60361",
//                    "img": "https://icoholder.com/media/cache/member_thumb/files/img/ebed86aa1c1072094bac9c65d1fdfd18.png",
//                    "description": null
//            },
//            {
//                "_id": "5af971e8b708365296f60360",
//                    "img": "https://icoholder.com/media/cache/member_thumb/files/img/33d67ba1d60190ccffffc368db1afef8.png",
//                    "description": null
//            },
//            {
//                "_id": "5af971e8b708365296f6035f",
//                    "img": "https://icoholder.com/media/cache/member_thumb/files/img/f5a7fa76d8f0e081e987c3b340d5109e.png",
//                    "description": null
//            }
//      ],
//            "icoPrice": [
//            {
//                "_id": "5b12db4ae8406031c9c98c2d",
//                    "symbol": "USD",
//                    "price": 0.0187,
//                    "goal": 20000000
//            },
//            {
//                "_id": "5b12db4ae8406031c9c98c2c",
//                    "symbol": "ETH",
//                    "price": 0.00003171
//            }
//      ],
//            "coin_ratio": [
//            {
//                "_id": "5b145be7c1295b05da1a7d1f",
//                    "name": "B",
//                    "value": 20
//            },
//            {
//                "_id": "5b14dd2e0368ca3f06b7dce5",
//                    "name": "T",
//                    "value": 15
//            },
//            {
//                "_id": "5b14dd2e0368ca3f06b7dce4",
//                    "name": "C",
//                    "value": 15
//            },
//            {
//                "_id": "5b14dd2e0368ca3f06b7dce3",
//                    "name": "O",
//                    "value": 5
//            },
//            {
//                "_id": "5b14dd2e0368ca3f06b7dce2",
//                    "name": "M",
//                    "value": 45
//            }
//      ],
//            "_id": "5b085ea2ce79d2cf9bcdb305",
//                    "id": "quarkchain",
//                    "createdAt": "2018-05-25T19:06:10.021Z",
//                    "updatedAt": "2018-06-14T13:30:17.022Z",
//                    "isHighRisk": false,
//                    "isScam": false,
//                    "isHot": false,
//                    "isChoice": false,
//                    "total_amount": 16000000,
//                    "hard_symbol": "USD",
//                    "sell_coin": "USD",
//                    "medium": "https://medium.com/@quarkchainquark",
//                    "github": "https://github.com/QuarkChain",
//                    "telegram": "https://t.me/quarkchainio",
//                    "twitter": "https://twitter.com/Quark_Chain",
//                    "facebook": "https://www.facebook.com/quarkchain.io",
//                    "whitePaper": "https://quarkchain.io/QUARK%20CHAIN%20Public%20Version%200.3.4.pdf",
//                    "website": "https://quarkchain.io",
//                    "from": "icomarks.com",
//                    "keys": "QKC QuarkChain quarkchain",
//                    "symbol": "QKC",
//                    "name": "QuarkChain",
//                    "img": "https://icomarks.com/files/companies/35/dc3aab1c8f6cbb3a490612bd8ab0b883.jpg",
//                    "detail_url": "https://icomarks.com/ico/quarkchain",
//                    "status": "trade",
//                    "real_sell": null,
//                    "min_personal_cap": "0.0001 ETH",
//                    "complex_score": 47.36,
//                    "score": "5afd7ce1749dca0923236a31",
//                    "legal_type": "",
//                    "ban_country": "Canada China Congo Cuba Ethiopia Iran Iraq Libya New Zealand North Korea Somalia South Sudan Sudan Sri Lanka Syria Tunisia USA Yemen",
//                    "blog": "https://medium.com/@quark_30920",
//                    "pre_sell_symbol": "USD",
//                    "startTime": 1525104000000,
//                    "endTime": 1527782400000,
//                    "isAdditional": false,
//                    "isWhitelist": true,
//                    "isKYC": true,
//                    "sell_amount": 20000000,
//                    "raised_symbol": "USD",
//                    "minimum": null,
//                    "soft_symbol": "USD",
//                    "usd_price": 0.0217,
//                    "pre_sale_startTime": null,
//                    "pre_sale_endTime": null,
//                    "coin_supply": 10000000000,
//                    "plan_sell": 2200000000,
//                    "linkedin": null,
//                    "forum": null,
//                    "instagram": null,
//                    "email": null,
//                    "youtube": null,
//                    "bitcointalk": null,
//                    "reddit": "https://www.reddit.com/r/QuarkChain/",
//                    "slack": null,
//                    "chain_type": "ERC-20",
//                    "media": null,
//                    "country": {
//                "country_code": "SG",
//                        "name": "新加坡",
//                        "en_name": "Singapore"
//            },
//            "max_personal_cap": "0.693 ETH for the first 12 hours and will double every 6 hours afterwards.",
//                    "progress_rate": 1.25,
//                    "coin": "5b14de8a2eb56e4c1e583d56",
//                    "coin_volume": 13446455.166614918,
//                    "coin_ex_num": 11,
//                    "coin_marketCap": 52491708,
//                    "coin_benefit": 6.77,
//                    "coin_price": 0.146858,
//                    "coin_listingTime": 1528041600000
//        },
//        "CNY_RATE": 6.393533,
//                "BTC_RATE": 0.00015576,
//                "ETH_RATE": 0.00208851,
//                "hasKline": true,
//                "hasNotices": true,
//                "concept": []
//    }
//    }
}
