.class public final Lcom/sma/smartv3/model/AppStoreFileManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFileTransmission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/AppStoreFileManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,243:1\n235#2,11:244\n246#2:256\n256#2:266\n235#2,11:267\n246#2:279\n256#2:289\n1#3:255\n1#3:278\n278#4,8:257\n298#4:265\n278#4,8:280\n298#4:288\n*S KotlinDebug\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/AppStoreFileManager\n*L\n170#1:244,11\n170#1:256\n170#1:266\n189#1:267,11\n189#1:279\n189#1:289\n170#1:255\n189#1:278\n170#1:257,8\n170#1:265\n189#1:280,8\n189#1:288\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFileTransmission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/AppStoreFileManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,243:1\n235#2,11:244\n246#2:256\n256#2:266\n235#2,11:267\n246#2:279\n256#2:289\n1#3:255\n1#3:278\n278#4,8:257\n298#4:265\n278#4,8:280\n298#4:288\n*S KotlinDebug\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/AppStoreFileManager\n*L\n170#1:244,11\n170#1:256\n170#1:266\n189#1:267,11\n189#1:279\n189#1:289\n170#1:255\n189#1:278\n170#1:257,8\n170#1:265\n189#1:280,8\n189#1:288\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/AppStoreFileManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/AppStoreFileManager;

    invoke-direct {v0}, Lcom/sma/smartv3/model/AppStoreFileManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/AppStoreFileManager;->INSTANCE:Lcom/sma/smartv3/model/AppStoreFileManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic downloadAppFile$default(Lcom/sma/smartv3/model/AppStoreFileManager;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/AppStoreFileManager;->downloadAppFile(Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public static synthetic getAppStoreFileList$default(Lcom/sma/smartv3/model/AppStoreFileManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const-string p1, "1"

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/AppStoreFileManager;->getAppStoreFileList(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic getAudioBookFileList$default(Lcom/sma/smartv3/model/AppStoreFileManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const-string p1, "2"

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/AppStoreFileManager;->getAudioBookFileList(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final downloadAppFile(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "appStore downloadAppFile path = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  , fileName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " , mBleAppFile -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "  , mOpType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getAbsolutePath(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;

    invoke-direct {v2, p2, p4, p3}, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, p1, v1, p2, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method public final getAppStoreFileList(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreFileList;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "appModuleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {p1}, Lcom/sma/smartv3/network/RequestBodyKt;->getAppStoreFileListBody(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/model/AppStoreFileManager$getAppStoreFileList$1;

    invoke-direct {v1, p2}, Lcom/sma/smartv3/model/AppStoreFileManager$getAppStoreFileList$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object p2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v4}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v4

    const-string v5, "/appx/appSearch"

    invoke-virtual {v0, v4, v5}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {p1}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object v8, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v0, v6, v7}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lcom/sma/smartv3/model/AppStoreFileManager$getAppStoreFileList$$inlined$postV2$default$1;

    invoke-direct {v4, v2, v1, v3}, Lcom/sma/smartv3/model/AppStoreFileManager$getAppStoreFileList$$inlined$postV2$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class v0, [Lcom/sma/smartv3/model/AppStoreFileList;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/model/AppStoreFileManager$getAppStoreFileList$$inlined$postV2$default$2;

    invoke-direct {v0, v4}, Lcom/sma/smartv3/model/AppStoreFileManager$getAppStoreFileList$$inlined$postV2$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, v0}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final getAudioBookFileList(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppFileDetail;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "appModuleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {p1}, Lcom/sma/smartv3/network/RequestBodyKt;->getAppStoreFileListBody(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/model/AppStoreFileManager$getAudioBookFileList$1;

    invoke-direct {v1, p2}, Lcom/sma/smartv3/model/AppStoreFileManager$getAudioBookFileList$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object p2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v4}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v4

    const-string v5, "/appx/appSearch"

    invoke-virtual {v0, v4, v5}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {p1}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object v8, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v0, v6, v7}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lcom/sma/smartv3/model/AppStoreFileManager$getAudioBookFileList$$inlined$postV2$default$1;

    invoke-direct {v4, v2, v1, v3}, Lcom/sma/smartv3/model/AppStoreFileManager$getAudioBookFileList$$inlined$postV2$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class v0, [Lcom/sma/smartv3/model/AppFileDetail;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/model/AppStoreFileManager$getAudioBookFileList$$inlined$postV2$default$2;

    invoke-direct {v0, v4}, Lcom/sma/smartv3/model/AppStoreFileManager$getAudioBookFileList$$inlined$postV2$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, v0}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method
