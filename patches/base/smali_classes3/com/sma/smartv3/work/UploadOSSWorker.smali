.class public final Lcom/sma/smartv3/work/UploadOSSWorker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;,
        Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;,
        Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOSSWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSSWorker.kt\ncom/sma/smartv3/work/UploadOSSWorker\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,520:1\n19#2:521\n15#2:522\n93#2,2:543\n90#2:545\n19#2:566\n15#2:567\n1869#3,2:523\n1869#3,2:525\n1869#3,2:527\n1869#3,2:529\n1869#3,2:531\n1869#3,2:533\n1869#3,2:535\n1869#3,2:537\n1869#3,2:539\n1869#3,2:541\n126#4,11:546\n146#4:565\n200#5,7:557\n218#5:564\n*S KotlinDebug\n*F\n+ 1 OSSWorker.kt\ncom/sma/smartv3/work/UploadOSSWorker\n*L\n85#1:521\n85#1:522\n331#1:543,2\n331#1:545\n371#1:566\n371#1:567\n93#1:523,2\n114#1:525,2\n129#1:527,2\n145#1:529,2\n161#1:531,2\n176#1:533,2\n194#1:535,2\n211#1:537,2\n226#1:539,2\n269#1:541,2\n344#1:546,11\n344#1:565\n344#1:557,7\n344#1:564\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOSSWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSSWorker.kt\ncom/sma/smartv3/work/UploadOSSWorker\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,520:1\n19#2:521\n15#2:522\n93#2,2:543\n90#2:545\n19#2:566\n15#2:567\n1869#3,2:523\n1869#3,2:525\n1869#3,2:527\n1869#3,2:529\n1869#3,2:531\n1869#3,2:533\n1869#3,2:535\n1869#3,2:537\n1869#3,2:539\n1869#3,2:541\n126#4,11:546\n146#4:565\n200#5,7:557\n218#5:564\n*S KotlinDebug\n*F\n+ 1 OSSWorker.kt\ncom/sma/smartv3/work/UploadOSSWorker\n*L\n85#1:521\n85#1:522\n331#1:543,2\n331#1:545\n371#1:566\n371#1:567\n93#1:523,2\n114#1:525,2\n129#1:527,2\n145#1:529,2\n161#1:531,2\n176#1:533,2\n194#1:535,2\n211#1:537,2\n226#1:539,2\n269#1:541,2\n344#1:546,11\n344#1:565\n344#1:557,7\n344#1:564\n*E\n"
    }
.end annotation


# static fields
.field public static IiI10X:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static O00:Lcom/android/mltcode/paycertificationapi/O1XIiIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/lang/StringBuffer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XO0O10:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final iO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-direct {v0}, Lcom/sma/smartv3/work/UploadOSSWorker;-><init>()V

    sput-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    const-string v0, "UploadOSSWorker"

    sput-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->iO:Ljava/lang/String;

    const-string v0, "OSSExpiryTime"

    sput-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->XO0O10:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->IiI10X:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;JJ)V
    .locals 0

    return-void
.end method

.method public static synthetic OXO1(Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;JJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/work/UploadOSSWorker;->IiI10X(Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;JJ)V

    return-void
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/work/UploadOSSWorker;Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Lcom/alibaba/sdk/android/oss/OSSClient;JLjava/io/File;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcom/sma/smartv3/work/UploadOSSWorker;->O00(Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Lcom/alibaba/sdk/android/oss/OSSClient;JLjava/io/File;)V

    return-void
.end method

.method public static final synthetic XO0O10()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->iO:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic iO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->O00:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    return-object v0
.end method


# virtual methods
.method public final I0IIOi(J)J
    .locals 2

    const-wide v0, 0xdc69183800L

    sub-long/2addr p1, v0

    const/16 v0, 0x3e8

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public final I0iXXO()Ljava/lang/StringBuffer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    return-object v0
.end method

.method public final I1XOi1(Ljava/io/File;)V
    .locals 5
    .param p1    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "cacheFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/work/UploadOSSWorker;->XO0O10:Ljava/lang/String;

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v1, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;

    invoke-virtual {v0}, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;->getResponse()Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;->getCredentials()Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;->getExpiration()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;->getResponse()Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;->getCredentials()Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;->getExpiration()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/work/UploadOSSWorker;->IO(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/work/UploadOSSWorker;->X1ii(Ljava/io/File;)V

    return-void

    :cond_1
    invoke-virtual {p0, v0, p1}, Lcom/sma/smartv3/work/UploadOSSWorker;->OIi0(Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;Ljava/io/File;)V

    return-void

    :cond_2
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/work/UploadOSSWorker;->X1ii(Ljava/io/File;)V

    return-void
.end method

.method public final IO(Ljava/lang/String;)Z
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "iso8601String"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/work/UploadOSSWorker;->iO:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v5, v0, v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-gez v5, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " expiryTime = "

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " ,  currentTimeMillis = "

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " ,  B = "

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    return v7

    :cond_1
    return v6
.end method

.method public final O00(Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Lcom/alibaba/sdk/android/oss/OSSClient;JLjava/io/File;)V
    .locals 0

    invoke-virtual {p1, p3, p4}, Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;->setPosition(J)V

    new-instance p3, Lcom/android/mltcode/paycertificationapi/q96;

    invoke-direct {p3}, Lcom/android/mltcode/paycertificationapi/q96;-><init>()V

    invoke-virtual {p1, p3}, Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;->setProgressCallback(Lcom/alibaba/sdk/android/oss/callback/OSSProgressCallback;)V

    new-instance p3, Lcom/sma/smartv3/work/UploadOSSWorker$OXO1;

    invoke-direct {p3, p5}, Lcom/sma/smartv3/work/UploadOSSWorker$OXO1;-><init>(Ljava/io/File;)V

    invoke-virtual {p2, p1, p3}, Lcom/alibaba/sdk/android/oss/OSSClient;->asyncAppendObject(Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Lcom/alibaba/sdk/android/oss/callback/OSSCompletedCallback;)Lcom/alibaba/sdk/android/oss/internal/OSSAsyncTask;

    move-result-object p1

    const-string p2, "asyncAppendObject(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final O10IXXX0X()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->XO0O10:Ljava/lang/String;

    return-object v0
.end method

.method public final OIX0iXi(Ljava/util/List;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 35
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "dataList"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "callback"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, " generateFile dataList.isEmpty() =  "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object/from16 v2, p0

    goto/16 :goto_b

    :cond_0
    sget-object v3, Lcom/sma/smartv3/work/UploadOSSWorker;->IiI10X:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, ""

    if-eqz v3, :cond_1

    sget-object v3, Lcom/sma/smartv3/work/UploadOSSWorker;->IiI10X:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "generateFile   handleError -->  \nlastClass = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " , \ndataList.last() = "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/sma/smartv3/work/UploadOSSWorker;->IiI10X:Ljava/lang/String;

    sput-object v1, Lcom/sma/smartv3/work/UploadOSSWorker;->O00:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v5, Lcom/sma/smartv3/model/AppUser;

    const v33, 0x7ffffff

    const/16 v34, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v5 .. v34}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v6, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v5, v2

    :goto_0
    check-cast v5, Lcom/sma/smartv3/model/AppUser;

    sget-object v2, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    const/4 v3, 0x0

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v6

    invoke-virtual {v2, v3, v6}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    const-class v2, Lcom/sma/smartv3/db/entity/Activity;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    const/16 v3, 0xa

    const/4 v6, 0x1

    const/16 v7, 0x9

    if-eqz v2, :cond_3

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "1"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/Activity;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Activity;->getMMode()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Activity;->getMState()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v9

    div-int/lit16 v9, v9, 0x2710

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v9

    div-int/lit16 v9, v9, 0x2710

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Activity;->getMIsDelete()I

    move-result v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1

    :cond_3
    const-class v2, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "3"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/HeartRate;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_2

    :cond_4
    const-class v2, Lcom/sma/smartv3/db/entity/Hrv;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "10"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/Hrv;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/Hrv;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Hrv;->getMTime()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Hrv;->getMAvgValue()I

    move-result v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_3

    :cond_5
    const-class v2, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "2"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_4

    :cond_6
    const-class v2, Lcom/sma/smartv3/db/entity/BloodOxygen;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "9"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/BloodOxygen;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/BloodOxygen;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMTime()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMValue()I

    move-result v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_5

    :cond_7
    const-class v2, Lcom/sma/smartv3/db/entity/Location;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "4"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/Location;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Location;->getMSource()I

    move-result v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_6

    :cond_8
    const-class v2, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "5"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/Sleep;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Sleep;->getMMode()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Sleep;->getMSoft()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Sleep;->getMStrong()I

    move-result v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_7

    :cond_9
    const-class v2, Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "6"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/Weight;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/Weight;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Weight;->getMTime()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_8

    :cond_a
    const-class v2, Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "7"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/Workout;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMAltitude()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMAirPressure()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMSpm()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMStep()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeed()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMIsDelete()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgBpm()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMinBpm()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxSpm()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMinSpm()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxPace()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMinPace()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMinAltitude()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMinStress()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxStress()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgStress()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMFeel()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMPrototype()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_9

    :cond_b
    const-class v2, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "8"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/db/entity/Temperature;->setMIsSync(I)V

    sget-object v8, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v9, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Temperature;->getMTime()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->I0IIOi(J)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_a

    :cond_c
    const-class v2, Lcom/sma/smartv3/db/entity/AlipayBindInfo;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    :cond_d
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_e

    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO:Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;)Z

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v4, Lcom/sma/smartv3/work/UploadOSSWorker;->iO:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " :  cacheFile = "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  content  :\n"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    move-object/from16 v2, p0

    :try_start_0
    invoke-virtual {v2, v0}, Lcom/sma/smartv3/work/UploadOSSWorker;->I1XOi1(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :goto_b
    return-void

    :cond_e
    move-object/from16 v2, p0

    return-void
.end method

.method public final OIi0(Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;Ljava/io/File;)V
    .locals 36
    .param p1    # Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p2

    const-string v1, "cacheFile"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, ""

    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;->getResponse()Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;->getCredentials()Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;->getAccessKeySecret()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    move-object v2, v1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;->getResponse()Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;->getCredentials()Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;->getAccessKeyId()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    :cond_2
    move-object v3, v1

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;->getResponse()Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/sma/smartv3/work/UploadOSSWorker$ResponseData;->getCredentials()Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/sma/smartv3/work/UploadOSSWorker$Credentials;->getSecurityToken()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    :cond_4
    move-object v4, v1

    :cond_5
    if-eqz p1, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;->getBucket()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_7

    :cond_6
    move-object v5, v1

    :cond_7
    if-eqz p1, :cond_9

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;->getEndPoint()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_8

    goto :goto_0

    :cond_8
    move-object v1, v6

    :cond_9
    :goto_0
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_c

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_c

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_c

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_c

    new-instance v6, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;

    invoke-direct {v6, v3, v2, v4}, Lcom/alibaba/sdk/android/oss/common/auth/OSSStsTokenCredentialProvider;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/alibaba/sdk/android/oss/OSSClient;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v3

    invoke-direct {v2, v3, v1, v6}, Lcom/alibaba/sdk/android/oss/OSSClient;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/common/auth/OSSCredentialProvider;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v6, Lcom/sma/smartv3/model/AppUser;

    const v34, 0x7ffffff

    const/16 v35, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v6 .. v35}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_1

    :cond_a
    move-object v6, v1

    :goto_1
    check-cast v6, Lcom/sma/smartv3/model/AppUser;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v3, Lcom/sma/smartv3/work/UploadOSSWorker;->iO:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getDbUrl()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " , onCreateOSSClient appUser.dbUrl = "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getDbUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_b

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getDbUrl()Ljava/lang/String;

    move-result-object v7

    const-string v1, "/"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v3, p0

    invoke-virtual {v3, v1, v2, v5, v0}, Lcom/sma/smartv3/work/UploadOSSWorker;->XOO0ii0(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/lang/String;Ljava/io/File;)V

    return-void

    :cond_b
    move-object/from16 v3, p0

    sget-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->O00:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz v0, :cond_d

    const-string v1, "dbUrl = null"

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    return-void

    :cond_c
    move-object/from16 v3, p0

    sget-object v0, Lcom/sma/smartv3/work/UploadOSSWorker;->O00:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz v0, :cond_d

    const-string v1, "token = null"

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_d
    return-void
.end method

.method public final X0O(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/alibaba/sdk/android/oss/OSSClient;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/alibaba/sdk/android/oss/OSSClient;",
            "Ljava/lang/String;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oss"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bucket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/work/UploadOSSWorker;->iO:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  isFileExist = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  bucket = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "db/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lcom/alibaba/sdk/android/oss/OSSClient;->doesObjectExist(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p4, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto/16 :goto_1

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p4, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "toString(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4, p2}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object p3, Lcom/sma/smartv3/work/UploadOSSWorker;->iO:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->getErrorCode()Ljava/lang/String;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ErrorCode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->getRequestId()Ljava/lang/String;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " RequestId "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->getHostId()Ljava/lang/String;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " HostId "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->getRawMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " RawMessage "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public final X1ii(Ljava/io/File;)V
    .locals 7
    .param p1    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "cacheFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lcom/sma/smartv3/work/UploadOSSWorker$getNetWorkUtilsSts$1;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/work/UploadOSSWorker$getNetWorkUtilsSts$1;-><init>(Ljava/io/File;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p1}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v4}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v4

    const-string v5, "/ali/getStsRam"

    invoke-virtual {v0, v4, v5}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lcom/sma/smartv3/work/UploadOSSWorker$getNetWorkUtilsSts$$inlined$get$default$1;

    invoke-direct {v4, p1, v2, v3}, Lcom/sma/smartv3/work/UploadOSSWorker$getNetWorkUtilsSts$$inlined$get$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Lcom/sma/smartv3/work/UploadOSSWorker$StsRamData;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v1, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/work/UploadOSSWorker$getNetWorkUtilsSts$$inlined$get$default$2;

    invoke-direct {v1, v4}, Lcom/sma/smartv3/work/UploadOSSWorker$getNetWorkUtilsSts$$inlined$get$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final XOO0ii0(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/lang/String;Ljava/io/File;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/alibaba/sdk/android/oss/OSSClient;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oss"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bucket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheFile"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "db/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, p3, v0, v1}, Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;-><init>(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Ljava/io/File;)V

    invoke-virtual {p0, v2, v3, v4, v1}, Lcom/sma/smartv3/work/UploadOSSWorker;->X0O(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public final XXI(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/alibaba/sdk/android/oss/OSSClient;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/alibaba/sdk/android/oss/OSSClient;",
            "Ljava/lang/String;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oss"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bucket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/alibaba/sdk/android/oss/model/HeadObjectRequest;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "db/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p3, p1}, Lcom/alibaba/sdk/android/oss/model/HeadObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/sma/smartv3/work/UploadOSSWorker$XIi00iiXO;

    invoke-direct {p1, p4}, Lcom/sma/smartv3/work/UploadOSSWorker$XIi00iiXO;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p2, v0, p1}, Lcom/alibaba/sdk/android/oss/OSSClient;->asyncHeadObject(Lcom/alibaba/sdk/android/oss/model/HeadObjectRequest;Lcom/alibaba/sdk/android/oss/callback/OSSCompletedCallback;)Lcom/alibaba/sdk/android/oss/internal/OSSAsyncTask;

    move-result-object p1

    const-string p2, "asyncHeadObject(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
