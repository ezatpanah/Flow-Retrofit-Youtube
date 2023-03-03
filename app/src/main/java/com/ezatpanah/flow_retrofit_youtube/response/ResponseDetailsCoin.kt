package com.ezatpanah.flow_retrofit_youtube.response

import com.google.gson.annotations.SerializedName


data class ResponseDetailsCoin(
    @SerializedName("additional_notices")
    val additionalNotices: List<Any>,
    @SerializedName("asset_platform_id")
    val assetPlatformId: Any,
    @SerializedName("block_time_in_minutes")
    val blockTimeInMinutes: Int,
    @SerializedName("categories")
    val categories: List<String>,
    @SerializedName("coingecko_rank")
    val coingeckoRank: Int,
    @SerializedName("coingecko_score")
    val coingeckoScore: Double,
    @SerializedName("community_data")
    val communityData: CommunityData,
    @SerializedName("community_score")
    val communityScore: Double,
    @SerializedName("country_origin")
    val countryOrigin: String,
    @SerializedName("description")
    val description: Description,
    @SerializedName("detail_platforms")
    val detailPlatforms: DetailPlatforms,
    @SerializedName("developer_data")
    val developerData: DeveloperData,
    @SerializedName("developer_score")
    val developerScore: Double,
    @SerializedName("genesis_date")
    val genesisDate: String,
    @SerializedName("hashing_algorithm")
    val hashingAlgorithm: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: Image,
    @SerializedName("last_updated")
    val lastUpdated: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("liquidity_score")
    val liquidityScore: Double,
    @SerializedName("localization")
    val localization: Localization,
    @SerializedName("market_cap_rank")
    val marketCapRank: Int,
    @SerializedName("market_data")
    val marketData: MarketData,
    @SerializedName("name")
    val name: String,
    @SerializedName("platforms")
    val platforms: Platforms,
    @SerializedName("public_interest_score")
    val publicInterestScore: Double,
    @SerializedName("public_interest_stats")
    val publicInterestStats: PublicInterestStats,
    @SerializedName("public_notice")
    val publicNotice: Any,
    @SerializedName("sentiment_votes_down_percentage")
    val sentimentVotesDownPercentage: Double,
    @SerializedName("sentiment_votes_up_percentage")
    val sentimentVotesUpPercentage: Double,
    @SerializedName("status_updates")
    val statusUpdates: List<Any>,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("tickers")
    val tickers: List<Ticker>,
) {
    data class CommunityData(
        @SerializedName("facebook_likes")
        val facebookLikes: Any,
        @SerializedName("reddit_accounts_active_48h")
        val redditAccountsActive48h: Int,
        @SerializedName("reddit_average_comments_48h")
        val redditAverageComments48h: Double,
        @SerializedName("reddit_average_posts_48h")
        val redditAveragePosts48h: Double,
        @SerializedName("reddit_subscribers")
        val redditSubscribers: Int,
        @SerializedName("telegram_channel_user_count")
        val telegramChannelUserCount: Any,
        @SerializedName("twitter_followers")
        val twitterFollowers: Int,
    )

    data class Description(
        @SerializedName("ar")
        val ar: String,
        @SerializedName("bg")
        val bg: String,
        @SerializedName("cs")
        val cs: String,
        @SerializedName("da")
        val da: String,
        @SerializedName("de")
        val de: String,
        @SerializedName("el")
        val el: String,
        @SerializedName("en")
        val en: String,
        @SerializedName("es")
        val es: String,
        @SerializedName("fi")
        val fi: String,
        @SerializedName("fr")
        val fr: String,
        @SerializedName("he")
        val he: String,
        @SerializedName("hi")
        val hi: String,
        @SerializedName("hr")
        val hr: String,
        @SerializedName("hu")
        val hu: String,
        @SerializedName("id")
        val id: String,
        @SerializedName("it")
        val `it`: String,
        @SerializedName("ja")
        val ja: String,
        @SerializedName("ko")
        val ko: String,
        @SerializedName("lt")
        val lt: String,
        @SerializedName("nl")
        val nl: String,
        @SerializedName("no")
        val no: String,
        @SerializedName("pl")
        val pl: String,
        @SerializedName("pt")
        val pt: String,
        @SerializedName("ro")
        val ro: String,
        @SerializedName("ru")
        val ru: String,
        @SerializedName("sk")
        val sk: String,
        @SerializedName("sl")
        val sl: String,
        @SerializedName("sv")
        val sv: String,
        @SerializedName("th")
        val th: String,
        @SerializedName("tr")
        val tr: String,
        @SerializedName("uk")
        val uk: String,
        @SerializedName("vi")
        val vi: String,
        @SerializedName("zh")
        val zh: String,
        @SerializedName("zh-tw")
        val zhTw: String,
    )

    data class DetailPlatforms(
        @SerializedName("")
        val x: X,
    ) {
        data class X(
            @SerializedName("contract_address")
            val contractAddress: String,
            @SerializedName("decimal_place")
            val decimalPlace: Any,
        )
    }

    data class DeveloperData(
        @SerializedName("closed_issues")
        val closedIssues: Int,
        @SerializedName("code_additions_deletions_4_weeks")
        val codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks,
        @SerializedName("commit_count_4_weeks")
        val commitCount4Weeks: Int,
        @SerializedName("forks")
        val forks: Int,
        @SerializedName("last_4_weeks_commit_activity_series")
        val last4WeeksCommitActivitySeries: List<Int>,
        @SerializedName("pull_request_contributors")
        val pullRequestContributors: Int,
        @SerializedName("pull_requests_merged")
        val pullRequestsMerged: Int,
        @SerializedName("stars")
        val stars: Int,
        @SerializedName("subscribers")
        val subscribers: Int,
        @SerializedName("total_issues")
        val totalIssues: Int,
    ) {
        data class CodeAdditionsDeletions4Weeks(
            @SerializedName("additions")
            val additions: Int,
            @SerializedName("deletions")
            val deletions: Int,
        )
    }

    data class Image(
        @SerializedName("large")
        val large: String,
        @SerializedName("small")
        val small: String,
        @SerializedName("thumb")
        val thumb: String,
    )

    data class Links(
        @SerializedName("announcement_url")
        val announcementUrl: List<String>,
        @SerializedName("bitcointalk_thread_identifier")
        val bitcointalkThreadIdentifier: Any,
        @SerializedName("blockchain_site")
        val blockchainSite: List<String>,
        @SerializedName("chat_url")
        val chatUrl: List<String>,
        @SerializedName("facebook_username")
        val facebookUsername: String,
        @SerializedName("homepage")
        val homepage: List<String>,
        @SerializedName("official_forum_url")
        val officialForumUrl: List<String>,
        @SerializedName("repos_url")
        val reposUrl: ReposUrl,
        @SerializedName("subreddit_url")
        val subredditUrl: String,
        @SerializedName("telegram_channel_identifier")
        val telegramChannelIdentifier: String,
        @SerializedName("twitter_screen_name")
        val twitterScreenName: String,
    ) {
        data class ReposUrl(
            @SerializedName("bitbucket")
            val bitbucket: List<Any>,
            @SerializedName("github")
            val github: List<String>,
        )
    }

    data class Localization(
        @SerializedName("ar")
        val ar: String,
        @SerializedName("bg")
        val bg: String,
        @SerializedName("cs")
        val cs: String,
        @SerializedName("da")
        val da: String,
        @SerializedName("de")
        val de: String,
        @SerializedName("el")
        val el: String,
        @SerializedName("en")
        val en: String,
        @SerializedName("es")
        val es: String,
        @SerializedName("fi")
        val fi: String,
        @SerializedName("fr")
        val fr: String,
        @SerializedName("he")
        val he: String,
        @SerializedName("hi")
        val hi: String,
        @SerializedName("hr")
        val hr: String,
        @SerializedName("hu")
        val hu: String,
        @SerializedName("id")
        val id: String,
        @SerializedName("it")
        val `it`: String,
        @SerializedName("ja")
        val ja: String,
        @SerializedName("ko")
        val ko: String,
        @SerializedName("lt")
        val lt: String,
        @SerializedName("nl")
        val nl: String,
        @SerializedName("no")
        val no: String,
        @SerializedName("pl")
        val pl: String,
        @SerializedName("pt")
        val pt: String,
        @SerializedName("ro")
        val ro: String,
        @SerializedName("ru")
        val ru: String,
        @SerializedName("sk")
        val sk: String,
        @SerializedName("sl")
        val sl: String,
        @SerializedName("sv")
        val sv: String,
        @SerializedName("th")
        val th: String,
        @SerializedName("tr")
        val tr: String,
        @SerializedName("uk")
        val uk: String,
        @SerializedName("vi")
        val vi: String,
        @SerializedName("zh")
        val zh: String,
        @SerializedName("zh-tw")
        val zhTw: String,
    )

    data class MarketData(
        @SerializedName("ath")
        val ath: Ath,
        @SerializedName("ath_change_percentage")
        val athChangePercentage: AthChangePercentage,
        @SerializedName("ath_date")
        val athDate: AthDate,
        @SerializedName("atl")
        val atl: Atl,
        @SerializedName("atl_change_percentage")
        val atlChangePercentage: AtlChangePercentage,
        @SerializedName("atl_date")
        val atlDate: AtlDate,
        @SerializedName("circulating_supply")
        val circulatingSupply: Double,
        @SerializedName("current_price")
        val currentPrice: CurrentPrice,
        @SerializedName("fdv_to_tvl_ratio")
        val fdvToTvlRatio: Any,
        @SerializedName("fully_diluted_valuation")
        val fullyDilutedValuation: FullyDilutedValuation,
        @SerializedName("high_24h")
        val high24h: High24h,
        @SerializedName("last_updated")
        val lastUpdated: String,
        @SerializedName("low_24h")
        val low24h: Low24h,
        @SerializedName("market_cap")
        val marketCap: MarketCap,
        @SerializedName("market_cap_change_24h")
        val marketCapChange24h: Double,
        @SerializedName("market_cap_change_24h_in_currency")
        val marketCapChange24hInCurrency: MarketCapChange24hInCurrency,
        @SerializedName("market_cap_change_percentage_24h")
        val marketCapChangePercentage24h: Double,
        @SerializedName("market_cap_change_percentage_24h_in_currency")
        val marketCapChangePercentage24hInCurrency: MarketCapChangePercentage24hInCurrency,
        @SerializedName("market_cap_rank")
        val marketCapRank: Int,
        @SerializedName("max_supply")
        val maxSupply: Double,
        @SerializedName("mcap_to_tvl_ratio")
        val mcapToTvlRatio: Any,
        @SerializedName("price_change_24h")
        val priceChange24h: Double,
        @SerializedName("price_change_24h_in_currency")
        val priceChange24hInCurrency: PriceChange24hInCurrency,
        @SerializedName("price_change_percentage_14d")
        val priceChangePercentage14d: Double,
        @SerializedName("price_change_percentage_14d_in_currency")
        val priceChangePercentage14dInCurrency: PriceChangePercentage14dInCurrency,
        @SerializedName("price_change_percentage_1h_in_currency")
        val priceChangePercentage1hInCurrency: PriceChangePercentage1hInCurrency,
        @SerializedName("price_change_percentage_1y")
        val priceChangePercentage1y: Double,
        @SerializedName("price_change_percentage_1y_in_currency")
        val priceChangePercentage1yInCurrency: PriceChangePercentage1yInCurrency,
        @SerializedName("price_change_percentage_200d")
        val priceChangePercentage200d: Double,
        @SerializedName("price_change_percentage_200d_in_currency")
        val priceChangePercentage200dInCurrency: PriceChangePercentage200dInCurrency,
        @SerializedName("price_change_percentage_24h")
        val priceChangePercentage24h: Double,
        @SerializedName("price_change_percentage_24h_in_currency")
        val priceChangePercentage24hInCurrency: PriceChangePercentage24hInCurrency,
        @SerializedName("price_change_percentage_30d")
        val priceChangePercentage30d: Double,
        @SerializedName("price_change_percentage_30d_in_currency")
        val priceChangePercentage30dInCurrency: PriceChangePercentage30dInCurrency,
        @SerializedName("price_change_percentage_60d")
        val priceChangePercentage60d: Double,
        @SerializedName("price_change_percentage_60d_in_currency")
        val priceChangePercentage60dInCurrency: PriceChangePercentage60dInCurrency,
        @SerializedName("price_change_percentage_7d")
        val priceChangePercentage7d: Double,
        @SerializedName("price_change_percentage_7d_in_currency")
        val priceChangePercentage7dInCurrency: PriceChangePercentage7dInCurrency,
        @SerializedName("roi")
        val roi: Any,
        @SerializedName("total_supply")
        val totalSupply: Double,
        @SerializedName("total_value_locked")
        val totalValueLocked: Any,
        @SerializedName("total_volume")
        val totalVolume: TotalVolume,
    ) {
        data class Ath(
            @SerializedName("aed")
            val aed: Int,
            @SerializedName("ars")
            val ars: Int,
            @SerializedName("aud")
            val aud: Int,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Int,
            @SerializedName("bhd")
            val bhd: Int,
            @SerializedName("bits")
            val bits: Int,
            @SerializedName("bmd")
            val bmd: Int,
            @SerializedName("bnb")
            val bnb: Int,
            @SerializedName("brl")
            val brl: Int,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Int,
            @SerializedName("chf")
            val chf: Int,
            @SerializedName("clp")
            val clp: Int,
            @SerializedName("cny")
            val cny: Int,
            @SerializedName("czk")
            val czk: Int,
            @SerializedName("dkk")
            val dkk: Int,
            @SerializedName("dot")
            val dot: Int,
            @SerializedName("eos")
            val eos: Int,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Int,
            @SerializedName("gbp")
            val gbp: Int,
            @SerializedName("hkd")
            val hkd: Int,
            @SerializedName("huf")
            val huf: Int,
            @SerializedName("idr")
            val idr: Int,
            @SerializedName("ils")
            val ils: Int,
            @SerializedName("inr")
            val inr: Int,
            @SerializedName("jpy")
            val jpy: Int,
            @SerializedName("krw")
            val krw: Int,
            @SerializedName("kwd")
            val kwd: Int,
            @SerializedName("link")
            val link: Int,
            @SerializedName("lkr")
            val lkr: Int,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Int,
            @SerializedName("mxn")
            val mxn: Int,
            @SerializedName("myr")
            val myr: Int,
            @SerializedName("ngn")
            val ngn: Int,
            @SerializedName("nok")
            val nok: Int,
            @SerializedName("nzd")
            val nzd: Int,
            @SerializedName("php")
            val php: Int,
            @SerializedName("pkr")
            val pkr: Int,
            @SerializedName("pln")
            val pln: Int,
            @SerializedName("rub")
            val rub: Int,
            @SerializedName("sar")
            val sar: Int,
            @SerializedName("sats")
            val sats: Int,
            @SerializedName("sek")
            val sek: Int,
            @SerializedName("sgd")
            val sgd: Int,
            @SerializedName("thb")
            val thb: Int,
            @SerializedName("try")
            val tryX: Int,
            @SerializedName("twd")
            val twd: Int,
            @SerializedName("uah")
            val uah: Int,
            @SerializedName("usd")
            val usd: Int,
            @SerializedName("vef")
            val vef: Long,
            @SerializedName("vnd")
            val vnd: Int,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Int,
            @SerializedName("xlm")
            val xlm: Int,
            @SerializedName("xrp")
            val xrp: Int,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Int,
        )

        data class AthChangePercentage(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class AthDate(
            @SerializedName("aed")
            val aed: String,
            @SerializedName("ars")
            val ars: String,
            @SerializedName("aud")
            val aud: String,
            @SerializedName("bch")
            val bch: String,
            @SerializedName("bdt")
            val bdt: String,
            @SerializedName("bhd")
            val bhd: String,
            @SerializedName("bits")
            val bits: String,
            @SerializedName("bmd")
            val bmd: String,
            @SerializedName("bnb")
            val bnb: String,
            @SerializedName("brl")
            val brl: String,
            @SerializedName("btc")
            val btc: String,
            @SerializedName("cad")
            val cad: String,
            @SerializedName("chf")
            val chf: String,
            @SerializedName("clp")
            val clp: String,
            @SerializedName("cny")
            val cny: String,
            @SerializedName("czk")
            val czk: String,
            @SerializedName("dkk")
            val dkk: String,
            @SerializedName("dot")
            val dot: String,
            @SerializedName("eos")
            val eos: String,
            @SerializedName("eth")
            val eth: String,
            @SerializedName("eur")
            val eur: String,
            @SerializedName("gbp")
            val gbp: String,
            @SerializedName("hkd")
            val hkd: String,
            @SerializedName("huf")
            val huf: String,
            @SerializedName("idr")
            val idr: String,
            @SerializedName("ils")
            val ils: String,
            @SerializedName("inr")
            val inr: String,
            @SerializedName("jpy")
            val jpy: String,
            @SerializedName("krw")
            val krw: String,
            @SerializedName("kwd")
            val kwd: String,
            @SerializedName("link")
            val link: String,
            @SerializedName("lkr")
            val lkr: String,
            @SerializedName("ltc")
            val ltc: String,
            @SerializedName("mmk")
            val mmk: String,
            @SerializedName("mxn")
            val mxn: String,
            @SerializedName("myr")
            val myr: String,
            @SerializedName("ngn")
            val ngn: String,
            @SerializedName("nok")
            val nok: String,
            @SerializedName("nzd")
            val nzd: String,
            @SerializedName("php")
            val php: String,
            @SerializedName("pkr")
            val pkr: String,
            @SerializedName("pln")
            val pln: String,
            @SerializedName("rub")
            val rub: String,
            @SerializedName("sar")
            val sar: String,
            @SerializedName("sats")
            val sats: String,
            @SerializedName("sek")
            val sek: String,
            @SerializedName("sgd")
            val sgd: String,
            @SerializedName("thb")
            val thb: String,
            @SerializedName("try")
            val tryX: String,
            @SerializedName("twd")
            val twd: String,
            @SerializedName("uah")
            val uah: String,
            @SerializedName("usd")
            val usd: String,
            @SerializedName("vef")
            val vef: String,
            @SerializedName("vnd")
            val vnd: String,
            @SerializedName("xag")
            val xag: String,
            @SerializedName("xau")
            val xau: String,
            @SerializedName("xdr")
            val xdr: String,
            @SerializedName("xlm")
            val xlm: String,
            @SerializedName("xrp")
            val xrp: String,
            @SerializedName("yfi")
            val yfi: String,
            @SerializedName("zar")
            val zar: String,
        )

        data class Atl(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Int,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Int,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Int,
            @SerializedName("idr")
            val idr: Int,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Int,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Int,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Int,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Int,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Int,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Int,
            @SerializedName("xrp")
            val xrp: Int,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class AtlChangePercentage(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class AtlDate(
            @SerializedName("aed")
            val aed: String,
            @SerializedName("ars")
            val ars: String,
            @SerializedName("aud")
            val aud: String,
            @SerializedName("bch")
            val bch: String,
            @SerializedName("bdt")
            val bdt: String,
            @SerializedName("bhd")
            val bhd: String,
            @SerializedName("bits")
            val bits: String,
            @SerializedName("bmd")
            val bmd: String,
            @SerializedName("bnb")
            val bnb: String,
            @SerializedName("brl")
            val brl: String,
            @SerializedName("btc")
            val btc: String,
            @SerializedName("cad")
            val cad: String,
            @SerializedName("chf")
            val chf: String,
            @SerializedName("clp")
            val clp: String,
            @SerializedName("cny")
            val cny: String,
            @SerializedName("czk")
            val czk: String,
            @SerializedName("dkk")
            val dkk: String,
            @SerializedName("dot")
            val dot: String,
            @SerializedName("eos")
            val eos: String,
            @SerializedName("eth")
            val eth: String,
            @SerializedName("eur")
            val eur: String,
            @SerializedName("gbp")
            val gbp: String,
            @SerializedName("hkd")
            val hkd: String,
            @SerializedName("huf")
            val huf: String,
            @SerializedName("idr")
            val idr: String,
            @SerializedName("ils")
            val ils: String,
            @SerializedName("inr")
            val inr: String,
            @SerializedName("jpy")
            val jpy: String,
            @SerializedName("krw")
            val krw: String,
            @SerializedName("kwd")
            val kwd: String,
            @SerializedName("link")
            val link: String,
            @SerializedName("lkr")
            val lkr: String,
            @SerializedName("ltc")
            val ltc: String,
            @SerializedName("mmk")
            val mmk: String,
            @SerializedName("mxn")
            val mxn: String,
            @SerializedName("myr")
            val myr: String,
            @SerializedName("ngn")
            val ngn: String,
            @SerializedName("nok")
            val nok: String,
            @SerializedName("nzd")
            val nzd: String,
            @SerializedName("php")
            val php: String,
            @SerializedName("pkr")
            val pkr: String,
            @SerializedName("pln")
            val pln: String,
            @SerializedName("rub")
            val rub: String,
            @SerializedName("sar")
            val sar: String,
            @SerializedName("sats")
            val sats: String,
            @SerializedName("sek")
            val sek: String,
            @SerializedName("sgd")
            val sgd: String,
            @SerializedName("thb")
            val thb: String,
            @SerializedName("try")
            val tryX: String,
            @SerializedName("twd")
            val twd: String,
            @SerializedName("uah")
            val uah: String,
            @SerializedName("usd")
            val usd: String,
            @SerializedName("vef")
            val vef: String,
            @SerializedName("vnd")
            val vnd: String,
            @SerializedName("xag")
            val xag: String,
            @SerializedName("xau")
            val xau: String,
            @SerializedName("xdr")
            val xdr: String,
            @SerializedName("xlm")
            val xlm: String,
            @SerializedName("xrp")
            val xrp: String,
            @SerializedName("yfi")
            val yfi: String,
            @SerializedName("zar")
            val zar: String,
        )

        data class CurrentPrice(
            @SerializedName("aed")
            val aed: Int,
            @SerializedName("ars")
            val ars: Int,
            @SerializedName("aud")
            val aud: Int,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Int,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Int,
            @SerializedName("bmd")
            val bmd: Int,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Int,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Int,
            @SerializedName("chf")
            val chf: Int,
            @SerializedName("clp")
            val clp: Int,
            @SerializedName("cny")
            val cny: Int,
            @SerializedName("czk")
            val czk: Int,
            @SerializedName("dkk")
            val dkk: Int,
            @SerializedName("dot")
            val dot: Int,
            @SerializedName("eos")
            val eos: Int,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Int,
            @SerializedName("gbp")
            val gbp: Int,
            @SerializedName("hkd")
            val hkd: Int,
            @SerializedName("huf")
            val huf: Int,
            @SerializedName("idr")
            val idr: Int,
            @SerializedName("ils")
            val ils: Int,
            @SerializedName("inr")
            val inr: Int,
            @SerializedName("jpy")
            val jpy: Int,
            @SerializedName("krw")
            val krw: Int,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Int,
            @SerializedName("lkr")
            val lkr: Int,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Int,
            @SerializedName("mxn")
            val mxn: Int,
            @SerializedName("myr")
            val myr: Int,
            @SerializedName("ngn")
            val ngn: Int,
            @SerializedName("nok")
            val nok: Int,
            @SerializedName("nzd")
            val nzd: Int,
            @SerializedName("php")
            val php: Int,
            @SerializedName("pkr")
            val pkr: Int,
            @SerializedName("pln")
            val pln: Int,
            @SerializedName("rub")
            val rub: Int,
            @SerializedName("sar")
            val sar: Int,
            @SerializedName("sats")
            val sats: Int,
            @SerializedName("sek")
            val sek: Int,
            @SerializedName("sgd")
            val sgd: Int,
            @SerializedName("thb")
            val thb: Int,
            @SerializedName("try")
            val tryX: Int,
            @SerializedName("twd")
            val twd: Int,
            @SerializedName("uah")
            val uah: Int,
            @SerializedName("usd")
            val usd: Int,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Int,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Int,
            @SerializedName("xrp")
            val xrp: Int,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Int,
        )

        data class FullyDilutedValuation(
            @SerializedName("aed")
            val aed: Long,
            @SerializedName("ars")
            val ars: Long,
            @SerializedName("aud")
            val aud: Long,
            @SerializedName("bch")
            val bch: Long,
            @SerializedName("bdt")
            val bdt: Long,
            @SerializedName("bhd")
            val bhd: Long,
            @SerializedName("bits")
            val bits: Long,
            @SerializedName("bmd")
            val bmd: Long,
            @SerializedName("bnb")
            val bnb: Int,
            @SerializedName("brl")
            val brl: Long,
            @SerializedName("btc")
            val btc: Int,
            @SerializedName("cad")
            val cad: Long,
            @SerializedName("chf")
            val chf: Long,
            @SerializedName("clp")
            val clp: Long,
            @SerializedName("cny")
            val cny: Long,
            @SerializedName("czk")
            val czk: Long,
            @SerializedName("dkk")
            val dkk: Long,
            @SerializedName("dot")
            val dot: Long,
            @SerializedName("eos")
            val eos: Long,
            @SerializedName("eth")
            val eth: Int,
            @SerializedName("eur")
            val eur: Long,
            @SerializedName("gbp")
            val gbp: Long,
            @SerializedName("hkd")
            val hkd: Long,
            @SerializedName("huf")
            val huf: Long,
            @SerializedName("idr")
            val idr: Long,
            @SerializedName("ils")
            val ils: Long,
            @SerializedName("inr")
            val inr: Long,
            @SerializedName("jpy")
            val jpy: Long,
            @SerializedName("krw")
            val krw: Long,
            @SerializedName("kwd")
            val kwd: Long,
            @SerializedName("link")
            val link: Long,
            @SerializedName("lkr")
            val lkr: Long,
            @SerializedName("ltc")
            val ltc: Long,
            @SerializedName("mmk")
            val mmk: Long,
            @SerializedName("mxn")
            val mxn: Long,
            @SerializedName("myr")
            val myr: Long,
            @SerializedName("ngn")
            val ngn: Long,
            @SerializedName("nok")
            val nok: Long,
            @SerializedName("nzd")
            val nzd: Long,
            @SerializedName("php")
            val php: Long,
            @SerializedName("pkr")
            val pkr: Long,
            @SerializedName("pln")
            val pln: Long,
            @SerializedName("rub")
            val rub: Long,
            @SerializedName("sar")
            val sar: Long,
            @SerializedName("sats")
            val sats: Long,
            @SerializedName("sek")
            val sek: Long,
            @SerializedName("sgd")
            val sgd: Long,
            @SerializedName("thb")
            val thb: Long,
            @SerializedName("try")
            val tryX: Long,
            @SerializedName("twd")
            val twd: Long,
            @SerializedName("uah")
            val uah: Long,
            @SerializedName("usd")
            val usd: Long,
            @SerializedName("vef")
            val vef: Long,
            @SerializedName("vnd")
            val vnd: Long,
            @SerializedName("xag")
            val xag: Long,
            @SerializedName("xau")
            val xau: Int,
            @SerializedName("xdr")
            val xdr: Long,
            @SerializedName("xlm")
            val xlm: Long,
            @SerializedName("xrp")
            val xrp: Long,
            @SerializedName("yfi")
            val yfi: Int,
            @SerializedName("zar")
            val zar: Long,
        )

        data class High24h(
            @SerializedName("aed")
            val aed: Int,
            @SerializedName("ars")
            val ars: Int,
            @SerializedName("aud")
            val aud: Int,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Int,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Int,
            @SerializedName("bmd")
            val bmd: Int,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Int,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Int,
            @SerializedName("chf")
            val chf: Int,
            @SerializedName("clp")
            val clp: Int,
            @SerializedName("cny")
            val cny: Int,
            @SerializedName("czk")
            val czk: Int,
            @SerializedName("dkk")
            val dkk: Int,
            @SerializedName("dot")
            val dot: Int,
            @SerializedName("eos")
            val eos: Int,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Int,
            @SerializedName("gbp")
            val gbp: Int,
            @SerializedName("hkd")
            val hkd: Int,
            @SerializedName("huf")
            val huf: Int,
            @SerializedName("idr")
            val idr: Int,
            @SerializedName("ils")
            val ils: Int,
            @SerializedName("inr")
            val inr: Int,
            @SerializedName("jpy")
            val jpy: Int,
            @SerializedName("krw")
            val krw: Int,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Int,
            @SerializedName("lkr")
            val lkr: Int,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Int,
            @SerializedName("mxn")
            val mxn: Int,
            @SerializedName("myr")
            val myr: Int,
            @SerializedName("ngn")
            val ngn: Int,
            @SerializedName("nok")
            val nok: Int,
            @SerializedName("nzd")
            val nzd: Int,
            @SerializedName("php")
            val php: Int,
            @SerializedName("pkr")
            val pkr: Int,
            @SerializedName("pln")
            val pln: Int,
            @SerializedName("rub")
            val rub: Int,
            @SerializedName("sar")
            val sar: Int,
            @SerializedName("sats")
            val sats: Int,
            @SerializedName("sek")
            val sek: Int,
            @SerializedName("sgd")
            val sgd: Int,
            @SerializedName("thb")
            val thb: Int,
            @SerializedName("try")
            val tryX: Int,
            @SerializedName("twd")
            val twd: Int,
            @SerializedName("uah")
            val uah: Int,
            @SerializedName("usd")
            val usd: Int,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Int,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Int,
            @SerializedName("xrp")
            val xrp: Int,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Int,
        )

        data class Low24h(
            @SerializedName("aed")
            val aed: Int,
            @SerializedName("ars")
            val ars: Int,
            @SerializedName("aud")
            val aud: Int,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Int,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Int,
            @SerializedName("bmd")
            val bmd: Int,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Int,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Int,
            @SerializedName("chf")
            val chf: Int,
            @SerializedName("clp")
            val clp: Int,
            @SerializedName("cny")
            val cny: Int,
            @SerializedName("czk")
            val czk: Int,
            @SerializedName("dkk")
            val dkk: Int,
            @SerializedName("dot")
            val dot: Int,
            @SerializedName("eos")
            val eos: Int,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Int,
            @SerializedName("gbp")
            val gbp: Int,
            @SerializedName("hkd")
            val hkd: Int,
            @SerializedName("huf")
            val huf: Int,
            @SerializedName("idr")
            val idr: Int,
            @SerializedName("ils")
            val ils: Int,
            @SerializedName("inr")
            val inr: Int,
            @SerializedName("jpy")
            val jpy: Int,
            @SerializedName("krw")
            val krw: Int,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Int,
            @SerializedName("lkr")
            val lkr: Int,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Int,
            @SerializedName("mxn")
            val mxn: Int,
            @SerializedName("myr")
            val myr: Int,
            @SerializedName("ngn")
            val ngn: Int,
            @SerializedName("nok")
            val nok: Int,
            @SerializedName("nzd")
            val nzd: Int,
            @SerializedName("php")
            val php: Int,
            @SerializedName("pkr")
            val pkr: Int,
            @SerializedName("pln")
            val pln: Int,
            @SerializedName("rub")
            val rub: Int,
            @SerializedName("sar")
            val sar: Int,
            @SerializedName("sats")
            val sats: Int,
            @SerializedName("sek")
            val sek: Int,
            @SerializedName("sgd")
            val sgd: Int,
            @SerializedName("thb")
            val thb: Int,
            @SerializedName("try")
            val tryX: Int,
            @SerializedName("twd")
            val twd: Int,
            @SerializedName("uah")
            val uah: Int,
            @SerializedName("usd")
            val usd: Int,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Int,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Int,
            @SerializedName("xrp")
            val xrp: Int,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Int,
        )

        data class MarketCap(
            @SerializedName("aed")
            val aed: Long,
            @SerializedName("ars")
            val ars: Long,
            @SerializedName("aud")
            val aud: Long,
            @SerializedName("bch")
            val bch: Long,
            @SerializedName("bdt")
            val bdt: Long,
            @SerializedName("bhd")
            val bhd: Long,
            @SerializedName("bits")
            val bits: Long,
            @SerializedName("bmd")
            val bmd: Long,
            @SerializedName("bnb")
            val bnb: Int,
            @SerializedName("brl")
            val brl: Long,
            @SerializedName("btc")
            val btc: Int,
            @SerializedName("cad")
            val cad: Long,
            @SerializedName("chf")
            val chf: Long,
            @SerializedName("clp")
            val clp: Long,
            @SerializedName("cny")
            val cny: Long,
            @SerializedName("czk")
            val czk: Long,
            @SerializedName("dkk")
            val dkk: Long,
            @SerializedName("dot")
            val dot: Long,
            @SerializedName("eos")
            val eos: Long,
            @SerializedName("eth")
            val eth: Int,
            @SerializedName("eur")
            val eur: Long,
            @SerializedName("gbp")
            val gbp: Long,
            @SerializedName("hkd")
            val hkd: Long,
            @SerializedName("huf")
            val huf: Long,
            @SerializedName("idr")
            val idr: Long,
            @SerializedName("ils")
            val ils: Long,
            @SerializedName("inr")
            val inr: Long,
            @SerializedName("jpy")
            val jpy: Long,
            @SerializedName("krw")
            val krw: Long,
            @SerializedName("kwd")
            val kwd: Long,
            @SerializedName("link")
            val link: Long,
            @SerializedName("lkr")
            val lkr: Long,
            @SerializedName("ltc")
            val ltc: Long,
            @SerializedName("mmk")
            val mmk: Long,
            @SerializedName("mxn")
            val mxn: Long,
            @SerializedName("myr")
            val myr: Long,
            @SerializedName("ngn")
            val ngn: Long,
            @SerializedName("nok")
            val nok: Long,
            @SerializedName("nzd")
            val nzd: Long,
            @SerializedName("php")
            val php: Long,
            @SerializedName("pkr")
            val pkr: Long,
            @SerializedName("pln")
            val pln: Long,
            @SerializedName("rub")
            val rub: Long,
            @SerializedName("sar")
            val sar: Long,
            @SerializedName("sats")
            val sats: Long,
            @SerializedName("sek")
            val sek: Long,
            @SerializedName("sgd")
            val sgd: Long,
            @SerializedName("thb")
            val thb: Long,
            @SerializedName("try")
            val tryX: Long,
            @SerializedName("twd")
            val twd: Long,
            @SerializedName("uah")
            val uah: Long,
            @SerializedName("usd")
            val usd: Long,
            @SerializedName("vef")
            val vef: Long,
            @SerializedName("vnd")
            val vnd: Long,
            @SerializedName("xag")
            val xag: Long,
            @SerializedName("xau")
            val xau: Int,
            @SerializedName("xdr")
            val xdr: Long,
            @SerializedName("xlm")
            val xlm: Long,
            @SerializedName("xrp")
            val xrp: Long,
            @SerializedName("yfi")
            val yfi: Int,
            @SerializedName("zar")
            val zar: Long,
        )

        data class MarketCapChange24hInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Int,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Int,
            @SerializedName("eos")
            val eos: Long,
            @SerializedName("eth")
            val eth: Int,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Long,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Long,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Int,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Long,
            @SerializedName("yfi")
            val yfi: Int,
            @SerializedName("zar")
            val zar: Double,
        )

        data class MarketCapChangePercentage24hInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class PriceChange24hInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class PriceChangePercentage14dInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class PriceChangePercentage1hInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class PriceChangePercentage1yInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class PriceChangePercentage200dInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class PriceChangePercentage24hInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class PriceChangePercentage30dInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class PriceChangePercentage60dInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class PriceChangePercentage7dInCurrency(
            @SerializedName("aed")
            val aed: Double,
            @SerializedName("ars")
            val ars: Double,
            @SerializedName("aud")
            val aud: Double,
            @SerializedName("bch")
            val bch: Double,
            @SerializedName("bdt")
            val bdt: Double,
            @SerializedName("bhd")
            val bhd: Double,
            @SerializedName("bits")
            val bits: Double,
            @SerializedName("bmd")
            val bmd: Double,
            @SerializedName("bnb")
            val bnb: Double,
            @SerializedName("brl")
            val brl: Double,
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("cad")
            val cad: Double,
            @SerializedName("chf")
            val chf: Double,
            @SerializedName("clp")
            val clp: Double,
            @SerializedName("cny")
            val cny: Double,
            @SerializedName("czk")
            val czk: Double,
            @SerializedName("dkk")
            val dkk: Double,
            @SerializedName("dot")
            val dot: Double,
            @SerializedName("eos")
            val eos: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("eur")
            val eur: Double,
            @SerializedName("gbp")
            val gbp: Double,
            @SerializedName("hkd")
            val hkd: Double,
            @SerializedName("huf")
            val huf: Double,
            @SerializedName("idr")
            val idr: Double,
            @SerializedName("ils")
            val ils: Double,
            @SerializedName("inr")
            val inr: Double,
            @SerializedName("jpy")
            val jpy: Double,
            @SerializedName("krw")
            val krw: Double,
            @SerializedName("kwd")
            val kwd: Double,
            @SerializedName("link")
            val link: Double,
            @SerializedName("lkr")
            val lkr: Double,
            @SerializedName("ltc")
            val ltc: Double,
            @SerializedName("mmk")
            val mmk: Double,
            @SerializedName("mxn")
            val mxn: Double,
            @SerializedName("myr")
            val myr: Double,
            @SerializedName("ngn")
            val ngn: Double,
            @SerializedName("nok")
            val nok: Double,
            @SerializedName("nzd")
            val nzd: Double,
            @SerializedName("php")
            val php: Double,
            @SerializedName("pkr")
            val pkr: Double,
            @SerializedName("pln")
            val pln: Double,
            @SerializedName("rub")
            val rub: Double,
            @SerializedName("sar")
            val sar: Double,
            @SerializedName("sats")
            val sats: Double,
            @SerializedName("sek")
            val sek: Double,
            @SerializedName("sgd")
            val sgd: Double,
            @SerializedName("thb")
            val thb: Double,
            @SerializedName("try")
            val tryX: Double,
            @SerializedName("twd")
            val twd: Double,
            @SerializedName("uah")
            val uah: Double,
            @SerializedName("usd")
            val usd: Double,
            @SerializedName("vef")
            val vef: Double,
            @SerializedName("vnd")
            val vnd: Double,
            @SerializedName("xag")
            val xag: Double,
            @SerializedName("xau")
            val xau: Double,
            @SerializedName("xdr")
            val xdr: Double,
            @SerializedName("xlm")
            val xlm: Double,
            @SerializedName("xrp")
            val xrp: Double,
            @SerializedName("yfi")
            val yfi: Double,
            @SerializedName("zar")
            val zar: Double,
        )

        data class TotalVolume(
            @SerializedName("aed")
            val aed: Long,
            @SerializedName("ars")
            val ars: Long,
            @SerializedName("aud")
            val aud: Long,
            @SerializedName("bch")
            val bch: Int,
            @SerializedName("bdt")
            val bdt: Long,
            @SerializedName("bhd")
            val bhd: Long,
            @SerializedName("bits")
            val bits: Long,
            @SerializedName("bmd")
            val bmd: Long,
            @SerializedName("bnb")
            val bnb: Int,
            @SerializedName("brl")
            val brl: Long,
            @SerializedName("btc")
            val btc: Int,
            @SerializedName("cad")
            val cad: Long,
            @SerializedName("chf")
            val chf: Long,
            @SerializedName("clp")
            val clp: Long,
            @SerializedName("cny")
            val cny: Long,
            @SerializedName("czk")
            val czk: Long,
            @SerializedName("dkk")
            val dkk: Long,
            @SerializedName("dot")
            val dot: Long,
            @SerializedName("eos")
            val eos: Long,
            @SerializedName("eth")
            val eth: Int,
            @SerializedName("eur")
            val eur: Long,
            @SerializedName("gbp")
            val gbp: Long,
            @SerializedName("hkd")
            val hkd: Long,
            @SerializedName("huf")
            val huf: Long,
            @SerializedName("idr")
            val idr: Long,
            @SerializedName("ils")
            val ils: Long,
            @SerializedName("inr")
            val inr: Long,
            @SerializedName("jpy")
            val jpy: Long,
            @SerializedName("krw")
            val krw: Long,
            @SerializedName("kwd")
            val kwd: Long,
            @SerializedName("link")
            val link: Long,
            @SerializedName("lkr")
            val lkr: Long,
            @SerializedName("ltc")
            val ltc: Int,
            @SerializedName("mmk")
            val mmk: Long,
            @SerializedName("mxn")
            val mxn: Long,
            @SerializedName("myr")
            val myr: Long,
            @SerializedName("ngn")
            val ngn: Long,
            @SerializedName("nok")
            val nok: Long,
            @SerializedName("nzd")
            val nzd: Long,
            @SerializedName("php")
            val php: Long,
            @SerializedName("pkr")
            val pkr: Long,
            @SerializedName("pln")
            val pln: Long,
            @SerializedName("rub")
            val rub: Long,
            @SerializedName("sar")
            val sar: Long,
            @SerializedName("sats")
            val sats: Long,
            @SerializedName("sek")
            val sek: Long,
            @SerializedName("sgd")
            val sgd: Long,
            @SerializedName("thb")
            val thb: Long,
            @SerializedName("try")
            val tryX: Long,
            @SerializedName("twd")
            val twd: Long,
            @SerializedName("uah")
            val uah: Long,
            @SerializedName("usd")
            val usd: Long,
            @SerializedName("vef")
            val vef: Long,
            @SerializedName("vnd")
            val vnd: Long,
            @SerializedName("xag")
            val xag: Int,
            @SerializedName("xau")
            val xau: Int,
            @SerializedName("xdr")
            val xdr: Long,
            @SerializedName("xlm")
            val xlm: Long,
            @SerializedName("xrp")
            val xrp: Long,
            @SerializedName("yfi")
            val yfi: Int,
            @SerializedName("zar")
            val zar: Long,
        )
    }

    data class Platforms(
        @SerializedName("")
        val x: String,
    )

    data class PublicInterestStats(
        @SerializedName("alexa_rank")
        val alexaRank: Int,
        @SerializedName("bing_matches")
        val bingMatches: Any,
    )

    data class Ticker(
        @SerializedName("base")
        val base: String,
        @SerializedName("bid_ask_spread_percentage")
        val bidAskSpreadPercentage: Double,
        @SerializedName("coin_id")
        val coinId: String,
        @SerializedName("converted_last")
        val convertedLast: ConvertedLast,
        @SerializedName("converted_volume")
        val convertedVolume: ConvertedVolume,
        @SerializedName("is_anomaly")
        val isAnomaly: Boolean,
        @SerializedName("is_stale")
        val isStale: Boolean,
        @SerializedName("last")
        val last: Double,
        @SerializedName("last_fetch_at")
        val lastFetchAt: String,
        @SerializedName("last_traded_at")
        val lastTradedAt: String,
        @SerializedName("market")
        val market: Market,
        @SerializedName("target")
        val target: String,
        @SerializedName("target_coin_id")
        val targetCoinId: String,
        @SerializedName("timestamp")
        val timestamp: String,
        @SerializedName("token_info_url")
        val tokenInfoUrl: Any,
        @SerializedName("trade_url")
        val tradeUrl: String,
        @SerializedName("trust_score")
        val trustScore: String,
        @SerializedName("volume")
        val volume: Double,
    ) {
        data class ConvertedLast(
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("usd")
            val usd: Int,
        )

        data class ConvertedVolume(
            @SerializedName("btc")
            val btc: Double,
            @SerializedName("eth")
            val eth: Double,
            @SerializedName("usd")
            val usd: Long,
        )

        data class Market(
            @SerializedName("has_trading_incentive")
            val hasTradingIncentive: Boolean,
            @SerializedName("identifier")
            val identifier: String,
            @SerializedName("name")
            val name: String,
        )
    }
}