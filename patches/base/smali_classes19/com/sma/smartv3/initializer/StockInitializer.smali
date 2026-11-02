.class public final Lcom/sma/smartv3/initializer/StockInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/s5;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStockInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockInitializer.kt\ncom/sma/smartv3/initializer/StockInitializer\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n19#2:154\n15#2:155\n176#3,11:156\n196#3:175\n252#4,7:167\n270#4:174\n1869#5,2:176\n*S KotlinDebug\n*F\n+ 1 StockInitializer.kt\ncom/sma/smartv3/initializer/StockInitializer\n*L\n90#1:154\n90#1:155\n98#1:156,11\n98#1:175\n98#1:167,7\n98#1:174\n123#1:176,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStockInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockInitializer.kt\ncom/sma/smartv3/initializer/StockInitializer\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n19#2:154\n15#2:155\n176#3,11:156\n196#3:175\n252#4,7:167\n270#4:174\n1869#5,2:176\n*S KotlinDebug\n*F\n+ 1 StockInitializer.kt\ncom/sma/smartv3/initializer/StockInitializer\n*L\n90#1:154\n90#1:155\n98#1:156,11\n98#1:175\n98#1:167,7\n98#1:174\n123#1:176,2\n*E\n"
    }
.end annotation


# static fields
.field public static final I1:Ljava/lang/String; = "Stock"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IO:Lcom/sma/smartv3/initializer/StockInitializer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static X11iII1O1:Z = false

.field public static final XXX11i:Lcom/sma/smartv3/initializer/StockInitializer$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final iX1O1:I = 0xc


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/initializer/StockInitializer;

    invoke-direct {v0}, Lcom/sma/smartv3/initializer/StockInitializer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/initializer/StockInitializer;->IO:Lcom/sma/smartv3/initializer/StockInitializer;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/initializer/StockInitializer;->X11iII1O1:Z

    new-instance v0, Lcom/sma/smartv3/initializer/StockInitializer$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/initializer/StockInitializer$OXO1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/initializer/StockInitializer;->XXX11i:Lcom/sma/smartv3/initializer/StockInitializer$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/initializer/StockInitializer;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/StockInitializer;->IiI10X(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final IiI10X(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/Stock;",
            ">;)V"
        }
    .end annotation

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X1OI()I

    move-result v0

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/Stock;

    new-instance v4, Lcom/szabh/smable3/entity/BleStock;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "STOCK_COLOR_TYPE"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0}, Lcom/sma/smartv3/model/Stock;->getCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/sma/smartv3/model/Stock;->getRealTimeClose()F

    move-result v7

    invoke-virtual {v0}, Lcom/sma/smartv3/model/Stock;->getRealTimeChange()F

    move-result v8

    invoke-virtual {v0}, Lcom/sma/smartv3/model/Stock;->getRealTimeChangePercentage()F

    move-result v9

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lcom/szabh/smable3/entity/BleStock;-><init>(ILjava/lang/String;FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "STOCK_SYNC_TIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->STOCK:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->RESET:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendList$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Ljava/util/List;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final O00(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/initializer/StockInitializer;->X11iII1O1:Z

    return-void
.end method

.method public OXO1(Landroid/app/Application;)V
    .locals 4
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/I0iIi;->OXO1:Lcom/android/mltcode/paycertificationapi/I0iIi;

    new-instance v1, Lcom/sma/smartv3/initializer/StockInitializer$init$1;

    invoke-direct {v1}, Lcom/sma/smartv3/initializer/StockInitializer$init$1;-><init>()V

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.TIME_TICK"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x2

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/I0iIi;->OXO1(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v0, Lcom/sma/smartv3/initializer/StockInitializer;->XXX11i:Lcom/sma/smartv3/initializer/StockInitializer$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public final XO0O10()Z
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "STOCK_SYNC_TIME"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/32 v0, 0x2932e00

    cmp-long v0, v2, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final XOO0ii0()V
    .locals 32

    const/4 v0, 0x0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iI1i01()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "Stock syncStock -> Device does not support sync stock"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-boolean v1, Lcom/sma/smartv3/initializer/StockInitializer;->X11iII1O1:Z

    if-nez v1, :cond_1

    const-string v0, "Stock syncStock -> The last Sync is not done, please wait"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    return-void

    :cond_1
    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v0, "Stock syncStock -> BleConnector is not available"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/initializer/StockInitializer;->XO0O10()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v0, "Stock syncStock -> Not time to sync stock"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    return-void

    :cond_3
    sget-object v1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v1}, Lcom/sma/smartv3/initializer/BleInitializer;->OI()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v0, "Stock firmware update....."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    return-void

    :cond_4
    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

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

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_6

    const-string v0, "Stock please login"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    return-void

    :cond_6
    sput-boolean v0, Lcom/sma/smartv3/initializer/StockInitializer;->X11iII1O1:Z

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/network/RequestBodyKt;->getStockListBody(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/initializer/StockInitializer$syncStock$1;

    invoke-direct {v3}, Lcom/sma/smartv3/initializer/StockInitializer$syncStock$1;-><init>()V

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v5

    sget-object v6, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v6}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v6

    const-string v7, "/finance_stock/user_show"

    invoke-virtual {v1, v6, v7}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Lcom/sma/smartv3/initializer/StockInitializer$syncStock$$inlined$post$default$1;

    invoke-direct {v6, v4, v3, v5}, Lcom/sma/smartv3/initializer/StockInitializer$syncStock$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    sget-object v2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/reflect/Type;

    const-class v3, [Lcom/sma/smartv3/model/Stock;

    aput-object v3, v2, v0

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, v2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/initializer/StockInitializer$syncStock$$inlined$post$default$2;

    invoke-direct {v2, v6}, Lcom/sma/smartv3/initializer/StockInitializer$syncStock$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v1, v0, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final iO()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/initializer/StockInitializer;->X11iII1O1:Z

    return v0
.end method
