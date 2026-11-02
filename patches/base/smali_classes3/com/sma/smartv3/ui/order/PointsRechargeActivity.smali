.class public final Lcom/sma/smartv3/ui/order/PointsRechargeActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPointsRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,309:1\n19#2:310\n15#2:311\n93#2,2:312\n90#2:314\n176#3,11:315\n196#3:334\n252#4,7:326\n270#4:333\n*S KotlinDebug\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity\n*L\n137#1:310\n137#1:311\n153#1:312,2\n153#1:314\n210#1:315,11\n210#1:334\n210#1:326,7\n210#1:333\n*E\n"
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\u9700\u6c42\u53d8\u66f4, \u5df2\u5e9f\u5f03"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPointsRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,309:1\n19#2:310\n15#2:311\n93#2,2:312\n90#2:314\n176#3,11:315\n196#3:334\n252#4,7:326\n270#4:333\n*S KotlinDebug\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity\n*L\n137#1:310\n137#1:311\n153#1:312,2\n153#1:314\n210#1:315,11\n210#1:334\n210#1:326,7\n210#1:333\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnRecharge$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbPointsPrivacy$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isNeedPayDialog:Z

.field private final ivAvatar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final layoutBg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPointsPackList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PointsPack;",
            ">;"
        }
    .end annotation
.end field

.field private mRechargePointPopup:Lcom/android/mltcode/paycertificationapi/OIXX00X;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSelectPointsPack:Lcom/sma/smartv3/model/PointsPack;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mUserCardView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private orderNum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rvPointsPack$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvNickname$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvPoints$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvPointsPrivacy$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "PointsRecharge"

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tz1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tz1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xz1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xz1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->layoutBg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yz1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yz1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->ivAvatar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zz1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zz1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->tvNickname$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/a02;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/a02;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->tvPoints$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/b02;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/b02;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->rvPointsPack$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c02;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c02;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->cbPointsPrivacy$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d02;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d02;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->tvPointsPrivacy$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/e02;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/e02;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->btnRecharge$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/f02;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/f02;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mUserCardView$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mPointsPackList:Ljava/util/List;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->orderNum:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->btnRecharge_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->ivAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->showPayConfirm$lambda$0$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->tvNickname_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->layoutBg_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->tvPoints_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/cardview/widget/CardView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mUserCardView_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/cardview/widget/CardView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->tvPointsPrivacy_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->rvPointsPack_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getOrderStatus$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->cbPointsPrivacy_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMPointsPackList$p(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mPointsPackList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getRvPointsPack(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getRvPointsPack()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setMSelectPointsPack$p(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Lcom/sma/smartv3/model/PointsPack;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mSelectPointsPack:Lcom/sma/smartv3/model/PointsPack;

    return-void
.end method

.method private static final btnRecharge_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01e0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final cbPointsPrivacy_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    const v0, 0x7f0a0212

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object p0
.end method

.method private final getBtnRecharge()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->btnRecharge$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getCbPointsPrivacy()Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->cbPointsPrivacy$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object v0
.end method

.method private final getIvAvatar()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->ivAvatar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getLayoutBg()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->layoutBg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMUserCardView()Landroidx/cardview/widget/CardView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mUserCardView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    return-object v0
.end method

.method private static final getOrderStatus$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->showRechargePointPopup()V

    goto :goto_0

    :cond_0
    const p0, 0x7f1410a9

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getPayInfo()V
    .locals 0

    return-void
.end method

.method private final getPointsPack()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getPointsPack"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {}, Lcom/sma/smartv3/network/RequestBodyKt;->getPointsPackBody()Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$getPointsPack$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$getPointsPack$1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/pointPack"

    invoke-virtual {v0, v5, v6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$getPointsPack$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$getPointsPack$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, [Lcom/sma/smartv3/model/PointsPack;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$getPointsPack$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$getPointsPack$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getRvPointsPack()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->rvPointsPack$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getTvNickname()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->tvNickname$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvPoints()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->tvPoints$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvPointsPrivacy()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->tvPointsPrivacy$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Landroid/view/View;)V

    return-void
.end method

.method private final initPointsPack()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getPointsPack()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getRvPointsPack()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getRvPointsPack()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mPointsPackList:Ljava/util/List;

    new-instance v2, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;

    invoke-direct {v2, p0, v1}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$initPointsPack$1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private final initUserPanel()V
    .locals 32

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getTvNickname()Landroid/widget/TextView;

    move-result-object v0

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

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getIvAvatar()Landroid/widget/ImageView;

    move-result-object v0

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getIvAvatar()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f081568

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getIvAvatar()Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->showPoints()V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getCbPointsPrivacy()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const p1, 0x7f14112a

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    new-array p1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mSelectPointsPack:Lcom/sma/smartv3/model/PointsPack;

    if-nez p1, :cond_1

    const p1, 0x7f141215

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    new-array p1, v0, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getPayInfo()V

    return-void
.end method

.method private static final ivAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a060f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final layoutBg_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a093a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mUserCardView_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/cardview/widget/CardView;
    .locals 1

    const v0, 0x7f0a0186

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/cardview/widget/CardView;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final rvPointsPack_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a09d1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final showPayConfirm()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f1410b3

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wz1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/wz1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    const v2, 0x7f14162a

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final showPayConfirm$lambda$0$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getOrderStatus()V

    const/4 p0, 0x1

    return p0
.end method

.method private final showPoints()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "USER_POINTS"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, Lcom/sma/smartv3/model/AccountPoints;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/sma/smartv3/model/AccountPoints;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getTvPoints()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AccountPoints;->getPoints()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final tvNickname_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0ccd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvPointsPrivacy_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0ce9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvPoints_delegate$lambda$0(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0ce7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getOrderNum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->orderNum:Ljava/lang/String;

    return-object v0
.end method

.method public final getOrderStatus()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->orderNum:Ljava/lang/String;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/vz1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/vz1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    const-string v3, "Points"

    invoke-virtual {v0, v1, v3, v2}, Lcom/sma/smartv3/biz/OrderManager;->XX0(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

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

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/BarUtils;->addMarginTopEqualStatusBarHeight(Landroid/view/View;)V

    const v0, 0x7f06055f

    invoke-static {p0, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p0, p0, v1}, Lcom/bestmafen/androidbase/base/BaseActivity;->setNavBarColor(Landroid/app/Activity;I)V

    const v1, 0x7f0a0023

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f1410ff

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->initUserPanel()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->initPointsPack()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getTvPointsPrivacy()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/SpanUtils;->with(Landroid/widget/TextView;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v1

    const v2, 0x7f1410fd

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v1

    const v2, 0x7f1410fe

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SpanUtils;->append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$OXO1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SpanUtils;->setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/blankj/utilcode/util/SpanUtils;->create()Landroid/text/SpannableStringBuilder;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getBtnRecharge()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/uz1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/uz1;-><init>(Lcom/sma/smartv3/ui/order/PointsRechargeActivity;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getLayoutBg()Landroid/view/View;

    move-result-object v1

    invoke-static {p0, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getMUserCardView()Landroidx/cardview/widget/CardView;

    move-result-object v0

    const v1, 0x7f060561

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final isNeedPayDialog()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->isNeedPayDialog:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00db

    return v0
.end method

.method public final onOrderPayStatusChange(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "ORDER_PAY_SUCCESS"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onOrderPayStatusChange"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->isNeedPayDialog:Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mPayconfirmPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getOrderStatus()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->isNeedPayDialog:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->isNeedPayDialog:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->showPayConfirm()V

    :cond_0
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onUserPointsChange(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "USER_POINTS"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onUserPointsChange"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->showPoints()V

    return-void
.end method

.method public final setNeedPayDialog(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->isNeedPayDialog:Z

    return-void
.end method

.method public final setOrderNum(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->orderNum:Ljava/lang/String;

    return-void
.end method

.method public final showRechargePointPopup()V
    .locals 3

    const-string v0, "onGetFreePoints"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mRechargePointPopup:Lcom/android/mltcode/paycertificationapi/OIXX00X;

    if-nez v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/OrderManager;->iIXi1iiXI(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIXX00X;

    const v1, 0x7f0d1012

    invoke-direct {v0, p0, v1}, Lcom/android/mltcode/paycertificationapi/OIXX00X;-><init>(Landroid/app/Activity;I)V

    const v1, 0x7f141162    # 1.96816E38f

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXX00X;->O1O(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mRechargePointPopup:Lcom/android/mltcode/paycertificationapi/OIXX00X;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->mRechargePointPopup:Lcom/android/mltcode/paycertificationapi/OIXX00X;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/PointsRechargeActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXX00X;->XiOIO(Landroid/view/View;)V

    :cond_1
    return-void
.end method
