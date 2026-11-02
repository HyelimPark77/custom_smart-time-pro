.class public final Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperTuyaQueryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,268:1\n176#2,11:269\n196#2:288\n176#2,11:289\n196#2:308\n176#2,11:309\n196#2:328\n252#3,7:280\n270#3:287\n252#3,7:300\n270#3:307\n252#3,7:320\n270#3:327\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity\n*L\n143#1:269,11\n143#1:288\n178#1:289,11\n178#1:308\n222#1:309,11\n222#1:328\n143#1:280,7\n143#1:287\n178#1:300,7\n178#1:307\n222#1:320,7\n222#1:327\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperTuyaQueryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,268:1\n176#2,11:269\n196#2:288\n176#2,11:289\n196#2:308\n176#2,11:309\n196#2:328\n252#3,7:280\n270#3:287\n252#3,7:300\n270#3:307\n252#3,7:320\n270#3:327\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity\n*L\n143#1:269,11\n143#1:288\n178#1:289,11\n178#1:308\n222#1:309,11\n222#1:328\n143#1:280,7\n143#1:287\n178#1:300,7\n178#1:307\n222#1:320,7\n222#1:327\n*E\n"
    }
.end annotation


# instance fields
.field private final btnOperate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final list:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mMac:Ljava/lang/String;

.field private mName:Ljava/lang/String;

.field private mPopup:Lcom/android/mltcode/paycertificationapi/dj4;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final tvCount$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvState$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiXIIi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiXIIi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->tvInfo$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0IOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0IOX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->tvState$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXI11X01O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXI11X01O;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->btnOperate$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXIXXX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXIXXX1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->tvCount$delegate:Lkotlin/Lazy;

    const-string v0, "3-\u5305\u88c5"

    const-string v1, "99-\u6062\u590d\u9ed8\u8ba4\u72b6\u6001\uff08\u5168\u90e8\u72b6\u6001\u7f6e\u4e3a0\uff09"

    const-string v2, "0-\u4e3b\u677f\u70e7\u5f55"

    const-string v3, "1-\u4ea7\u7ebf\u4e00\u68c0"

    const-string v4, "2-\u4ea7\u7ebf\u4e8c\u68c0"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->list:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->onOperate$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->tvState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->onQuery$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->onExportCsv$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->tvCount_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->btnOperate_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->tvInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getMNow(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->getMNow()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getShareFile(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->getShareFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvCount(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->getTvCount()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvState(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->getTvState()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final btnOperate_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01db

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final getBtnOperate()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->btnOperate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getMNow()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd-HH-mm-ss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getShareFile(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    sget-object v1, Lcom/bestmafen/androidbase/io/Location;->EXTERNAL:Lcom/bestmafen/androidbase/io/Location;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/hn1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/hn1$OXO1;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/hn1$OXO1;->O00()Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v2

    const-string v3, "share"

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/hn1;->XIi00iiXO(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1(Lcom/bestmafen/androidbase/io/Location;Lcom/android/mltcode/paycertificationapi/hn1;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method private final getTvCount()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->tvCount$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvInfo()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->tvInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvState()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->tvState$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final onExportCsv$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->export()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onOperate$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;I)Z
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->getBtnOperate()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->list:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f53\u524d\uff1a\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "DEVELOPER_QUREY_STEP_VALUE"

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->queryCount(I)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final onQuery$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Z
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "DEVELOPER_QUREY_STEP_VALUE"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/16 v0, 0x63

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->query(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->query(I)V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final tvCount_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c03

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c08

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvState_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c13

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final export()V
    .locals 9

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v1, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mName:Ljava/lang/String;

    const/4 v4, 0x0

    if-nez v3, :cond_2

    const-string v3, "mName"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v4

    :cond_2
    const-string v5, "bleName"

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    invoke-virtual {v1, v4, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v5

    sget-object v6, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v6}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v6

    const-string v7, "/tuya/authorization_code_unuse"

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

    new-instance v6, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$$inlined$post$default$1;

    invoke-direct {v6, v4, v3, v5}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

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

    const-class v3, [Lcom/android/mltcode/paycertificationapi/j36;

    aput-object v3, v2, v0

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, v2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$$inlined$post$default$2;

    invoke-direct {v2, v6}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v1, v0, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
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
    .locals 7

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "name"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mName:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mac"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mMac:Ljava/lang/String;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mName:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "mName"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mMac:Ljava/lang/String;

    if-nez v3, :cond_1

    const-string v3, "mMac"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u84dd\u7259\u540d\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\n\n\u5730\u5740\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->getBtnOperate()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->list:Ljava/util/List;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    const-string v4, "DEVELOPER_QUREY_STEP_VALUE"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u5f53\u524d\uff1a\n"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->queryCount(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d007a

    return v0
.end method

.method public final onExportCsv(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v0, "\u662f\u5426\u5bfc\u51fa\u6570\u636e\uff1f"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->iI(Ljava/lang/String;)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOIiIXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOIiIXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    const v1, 0x7f14034b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    const v0, 0x7f0a09b5

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->X0O(I)V

    return-void
.end method

.method public final onOperate(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-nez p1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dj4;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->list:Ljava/util/List;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/dj4;-><init>(Landroid/app/Activity;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/O1i1X;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/O1i1X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/dj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    iget-object p1, v1, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v2, "DEVELOPER_QUREY_STEP_VALUE"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    const v0, 0x7f0a09b5

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->X0O(I)V

    :cond_1
    return-void
.end method

.method public final onQuery(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->list:Ljava/util/List;

    sget-object v4, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    const-string v5, "DEVELOPER_QUREY_STEP_VALUE"

    invoke-virtual {v4, v5, v0}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5f53\u524d\uff1a\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->iI(Ljava/lang/String;)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1OI1IIiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1OI1IIiO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    const v1, 0x7f14034b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    const v0, 0x7f0a09b5

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->X0O(I)V

    return-void
.end method

.method public final query(I)V
    .locals 8

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v1, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mName:Ljava/lang/String;

    const/4 v4, 0x0

    if-nez v3, :cond_2

    const-string v3, "mName"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v4

    :cond_2
    const-string v5, "bleName"

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mMac:Ljava/lang/String;

    if-nez v3, :cond_3

    const-string v3, "mMac"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v4

    :cond_3
    const-string v5, "mac"

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "queryStep"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$3;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$3;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    invoke-virtual {v1, v4, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v3

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/tuya/authorization_code_state"

    invoke-virtual {v1, v5, v6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$$inlined$post$default$1;

    invoke-direct {v5, v4, p1, v3}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/String;

    aput-object v2, v1, v0

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$$inlined$post$default$2;

    invoke-direct {v1, v5}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$query$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final queryCount(I)V
    .locals 8

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v1, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->mName:Ljava/lang/String;

    const/4 v4, 0x0

    if-nez v3, :cond_2

    const-string v3, "mName"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v4

    :cond_2
    const-string v5, "bleName"

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x4

    if-ne p1, v3, :cond_3

    const-string p1, "99"

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v3, "queryStep"

    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$3;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$3;-><init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V

    invoke-virtual {v1, v4, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v3

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/tuya/authorization_code_find_count"

    invoke-virtual {v1, v5, v6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$$inlined$post$default$1;

    invoke-direct {v5, v4, p1, v3}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/String;

    aput-object v2, v1, v0

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$$inlined$post$default$2;

    invoke-direct {v1, v5}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$queryCount$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method
