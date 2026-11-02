.class public final Lcom/sma/smartv3/ui/me/WebViewV2Activity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebBleInfo;,
        Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebInfo;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWebViewV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewV2Activity.kt\ncom/sma/smartv3/ui/me/WebViewV2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,368:1\n19#2:369\n15#2:370\n90#2:371\n90#2:372\n90#2:373\n19#2:374\n15#2:375\n87#3,7:376\n94#3,3:384\n70#3,7:387\n97#3:394\n1#4:383\n*S KotlinDebug\n*F\n+ 1 WebViewV2Activity.kt\ncom/sma/smartv3/ui/me/WebViewV2Activity\n*L\n195#1:369\n195#1:370\n199#1:371\n236#1:372\n237#1:373\n273#1:374\n273#1:375\n96#1:376,7\n96#1:384,3\n96#1:387,7\n96#1:394\n96#1:383\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWebViewV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewV2Activity.kt\ncom/sma/smartv3/ui/me/WebViewV2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,368:1\n19#2:369\n15#2:370\n90#2:371\n90#2:372\n90#2:373\n19#2:374\n15#2:375\n87#3,7:376\n94#3,3:384\n70#3,7:387\n97#3:394\n1#4:383\n*S KotlinDebug\n*F\n+ 1 WebViewV2Activity.kt\ncom/sma/smartv3/ui/me/WebViewV2Activity\n*L\n195#1:369\n195#1:370\n199#1:371\n236#1:372\n237#1:373\n273#1:374\n273#1:375\n96#1:376,7\n96#1:384,3\n96#1:387,7\n96#1:394\n96#1:383\n*E\n"
    }
.end annotation


# instance fields
.field private final RESULT_CODE:I

.field private isUseWebViewTitle:Z

.field private mUploadMessage:Landroid/webkit/ValueCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private mUploadMessageArray:Landroid/webkit/ValueCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private final rightTitleTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final titleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final webView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rx6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rx6;-><init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->webView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sx6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sx6;-><init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->titleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tx6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tx6;-><init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->rightTitleTv$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->sendBleInfo$lambda$0(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Lcom/github/lzyzsd/jsbridge/BridgeWebView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->webView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->rightTitleTv_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->titleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/sma/smartv3/model/AppUser;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->initView$lambda$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/sma/smartv3/model/AppUser;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/model/AppUser;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getLog$lambda$1(Lcom/sma/smartv3/model/AppUser;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/android/mltcode/paycertificationapi/X1OI0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getLog$lambda$1$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/android/mltcode/paycertificationapi/X1OI0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getWebView(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Lcom/github/lzyzsd/jsbridge/BridgeWebView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object p0

    return-object p0
.end method

.method private final genLogZipFile(Ljava/lang/String;)Ljava/io/File;
    .locals 6

    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    sget-object v1, Lcom/bestmafen/androidbase/io/Location;->EXTERNAL:Lcom/bestmafen/androidbase/io/Location;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/hn1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/hn1$OXO1;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/hn1$OXO1;->O00()Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v3

    const-string v4, "share"

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/hn1;->XIi00iiXO(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v3

    invoke-virtual {v0, v1, v3, p1}, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1(Lcom/bestmafen/androidbase/io/Location;Lcom/android/mltcode/paycertificationapi/hn1;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    sget-object v1, Lcom/bestmafen/androidbase/io/Location;->INTERNAL:Lcom/bestmafen/androidbase/io/Location;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/hn1$OXO1;->XIi00iiXO()Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/sz0;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/sz0;Lcom/bestmafen/androidbase/io/Location;Lcom/android/mltcode/paycertificationapi/hn1;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;

    move-result-object v1

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->X0i1O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->X1IX(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    filled-new-array {v1, v2, v0}, [Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ZipUtils;->zipFiles(Ljava/util/Collection;Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final getLog(Lcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 32

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->RAW_SLEEP:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v3

    const-string v4, "JL"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v3

    const-string v4, "JL707"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    const-string v3, "JL707Lite"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    sget-object v1, Lcom/szabh/smable3/BleKey;->DEVICE_FILE:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "NO_LOGIN_USER_INFO"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5f

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AppUser;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :cond_3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/qx6;

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    invoke-direct {v3, v2, v1, v4, v5}, Lcom/android/mltcode/paycertificationapi/qx6;-><init>(Lcom/sma/smartv3/model/AppUser;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final getLog$lambda$1(Lcom/sma/smartv3/model/AppUser;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 8

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "_"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ".zip"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v5, Lcom/android/mltcode/paycertificationapi/px6;

    invoke-direct {v5, p2, p0, p1, p3}, Lcom/android/mltcode/paycertificationapi/px6;-><init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void
.end method

.method private static final getLog$lambda$1$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/android/mltcode/paycertificationapi/X1OI0;)Lkotlin/Unit;
    .locals 2

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->genLogZipFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/UploadFileManager;->OXO1:Lcom/sma/smartv3/biz/UploadFileManager;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    new-instance v1, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;

    invoke-direct {v1, p1, p0, p3}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$getLog$2$1$1$1;-><init>(Ljava/io/File;Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    invoke-virtual {v0, p2, p1, v1}, Lcom/sma/smartv3/biz/UploadFileManager;->IiI10X(Ljava/lang/String;Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getRightTitleTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->rightTitleTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic getWebBleInfo$default(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 9

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_1

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, p3

    :goto_1
    and-int/lit8 v2, p6, 0x8

    if-eqz v2, :cond_2

    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v4, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, p4

    :goto_2
    and-int/lit8 v3, p6, 0x10

    if-eqz v3, :cond_3

    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v3}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v6, ":"

    const-string v7, ""

    const/4 v8, 0x0

    move-object p2, v3

    move p6, v4

    move-object/from16 p7, v5

    move-object p3, v6

    move-object p4, v7

    move p5, v8

    invoke-static/range {p2 .. p7}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 p7, v3

    :goto_3
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move-object p5, v1

    move-object p6, v2

    goto :goto_4

    :cond_3
    move-object/from16 p7, p5

    goto :goto_3

    :goto_4
    invoke-virtual/range {p2 .. p7}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebBleInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->webView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/sma/smartv3/model/AppUser;Landroid/view/View;)V
    .locals 6

    sget-object p2, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {p2}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "kotlinweb"

    const-string v2, ""

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/feedback/#/feedbackHistory?identity="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final rightTitleTv_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a09a2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method public static synthetic sendBleInfo$default(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-string p1, "error"

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->sendBleInfo(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    return-void
.end method

.method private static final sendBleInfo$lambda$0(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "webView shareLog  send "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-interface {p1, p0}, Lcom/android/mltcode/paycertificationapi/X1OI0;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private static final titleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final webView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Lcom/github/lzyzsd/jsbridge/BridgeWebView;
    .locals 1

    const v0, 0x7f0a1935

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    return-object p0
.end method


# virtual methods
.method public final getMUploadMessage()Landroid/webkit/ValueCallback;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessage:Landroid/webkit/ValueCallback;

    return-object v0
.end method

.method public final getMUploadMessageArray()Landroid/webkit/ValueCallback;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessageArray:Landroid/webkit/ValueCallback;

    return-object v0
.end method

.method public final getRESULT_CODE()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->RESULT_CODE:I

    return v0
.end method

.method public final getTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->titleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getWebBleInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 46
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "info"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "bleName"

    move-object/from16 v4, p2

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "flag"

    move-object/from16 v5, p3

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "bleVersion"

    move-object/from16 v7, p4

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mac"

    move-object/from16 v9, p5

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v15, Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebBleInfo;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v15, v2, v2, v3, v2}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebBleInfo;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v15, v0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebBleInfo;->setLogPath(Ljava/lang/String;)V

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionName()Ljava/lang/String;

    move-result-object v8

    const-string v0, "getAppVersionName(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v16, Lcom/sma/smartv3/model/AppUser;

    const v44, 0x7ffffff

    const/16 v45, 0x0

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

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-direct/range {v16 .. v45}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v16, v0

    :goto_0
    check-cast v16, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual/range {v16 .. v16}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->XXX11i()Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X11iII1O1()Ljava/lang/String;

    move-result-object v12

    new-instance v2, Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebInfo;

    const/16 v13, 0x80

    const/4 v14, 0x0

    const-string v6, "58"

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v14}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v15, v2}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebBleInfo;->setBleInfo(Lcom/sma/smartv3/ui/me/WebViewV2Activity$WebInfo;)V

    invoke-virtual {v1, v15}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toJson(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/model/AppUser;->Companion:Lcom/sma/smartv3/model/AppUser$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser$Companion;->getAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    if-eq v1, v3, :cond_0

    iput-boolean v3, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->isUseWebViewTitle:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140bcf

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getTitleCenter()Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f140bce

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getRightTitleTv()Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getRightTitleTv()Landroid/widget/TextView;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/nx6;

    invoke-direct {v2, p0, v0}, Lcom/android/mltcode/paycertificationapi/nx6;-><init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/sma/smartv3/model/AppUser;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iiIIOXXXO;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/iiIIOXXXO;-><init>()V

    invoke-virtual {v0, v1}, Lcom/github/lzyzsd/jsbridge/BridgeWebView;->setDefaultHandler(Lcom/android/mltcode/paycertificationapi/X0i00iX1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;

    invoke-direct {v2, p0, v1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;-><init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/github/lzyzsd/jsbridge/BridgeWebView;)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "webView url "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public final isUseWebViewTitle()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->isUseWebViewTitle:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00c7

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    iget v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->RESULT_CODE:I

    if-ne p1, v0, :cond_9

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessage:Landroid/webkit/ValueCallback;

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessageArray:Landroid/webkit/ValueCallback;

    if-nez v0, :cond_0

    goto :goto_5

    :cond_0
    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessageArray:Landroid/webkit/ValueCallback;

    if-nez p1, :cond_4

    if-eqz p3, :cond_2

    if-eq p2, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    goto :goto_1

    :cond_2
    :goto_0
    move-object p1, v1

    :goto_1
    iget-object v2, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessage:Landroid/webkit/ValueCallback;

    if-eqz v2, :cond_3

    invoke-interface {v2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_3
    iput-object v1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessage:Landroid/webkit/ValueCallback;

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessage:Landroid/webkit/ValueCallback;

    if-nez p1, :cond_9

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessageArray:Landroid/webkit/ValueCallback;

    if-eqz p1, :cond_9

    if-eqz p3, :cond_6

    if-eq p2, v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    goto :goto_3

    :cond_6
    :goto_2
    move-object p1, v1

    :goto_3
    if-eqz p1, :cond_7

    iget-object p2, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessageArray:Landroid/webkit/ValueCallback;

    if-eqz p2, :cond_8

    filled-new-array {p1}, [Landroid/net/Uri;

    move-result-object p1

    invoke-interface {p2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessageArray:Landroid/webkit/ValueCallback;

    if-eqz p1, :cond_8

    invoke-interface {p1, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_8
    :goto_4
    iput-object v1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessageArray:Landroid/webkit/ValueCallback;

    :cond_9
    :goto_5
    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebView()Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final pickFile()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget v1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->RESULT_CODE:I

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public final sendBleInfo(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/X1OI0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBridgeHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "LAST_BIND_DEVICE_DATA"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5f

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v6, Lcom/sma/smartv3/model/DeviceLaseRecord;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/DeviceLaseRecord;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "LAST_CLICK_DEVICE_DATA"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/DeviceLaseRecord;

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/DeviceLaseRecord;->getBleName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/DeviceLaseRecord;->getBleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/DeviceLaseRecord;->getFlag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/sma/smartv3/model/DeviceLaseRecord;->getBleVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/sma/smartv3/model/DeviceLaseRecord;->getMac()Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, ":"

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebBleInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/DeviceLaseRecord;->getBleName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/DeviceLaseRecord;->getBleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/DeviceLaseRecord;->getMac()Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, ":"

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v4, ""

    const-string v5, ""

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebBleInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, ":"

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object v2, p1

    move-object v3, v0

    move-object v4, v1

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getWebBleInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/ox6;

    invoke-direct {v1, v0, p2}, Lcom/android/mltcode/paycertificationapi/ox6;-><init>(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final setMUploadMessage(Landroid/webkit/ValueCallback;)V
    .locals 0
    .param p1    # Landroid/webkit/ValueCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessage:Landroid/webkit/ValueCallback;

    return-void
.end method

.method public final setMUploadMessageArray(Landroid/webkit/ValueCallback;)V
    .locals 0
    .param p1    # Landroid/webkit/ValueCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->mUploadMessageArray:Landroid/webkit/ValueCallback;

    return-void
.end method

.method public final setUseWebViewTitle(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->isUseWebViewTitle:Z

    return-void
.end method

.method public final shareLog(ZLcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 2
    .param p2    # Lcom/android/mltcode/paycertificationapi/X1OI0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mBridgeHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "webView shareLog bool = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->getLog(Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    return-void

    :cond_0
    const-string p1, ""

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->sendBleInfo(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    return-void
.end method
