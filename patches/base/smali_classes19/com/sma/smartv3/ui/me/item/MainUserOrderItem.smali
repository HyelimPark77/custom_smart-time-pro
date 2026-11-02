.class public Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainUserOrderItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainUserOrderItem.kt\ncom/sma/smartv3/ui/me/item/MainUserOrderItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,269:1\n93#2,2:270\n90#2:272\n93#2,2:273\n90#2:275\n1#3:276\n1#3:284\n87#4,7:277\n94#4,3:285\n70#4,7:288\n97#4:295\n*S KotlinDebug\n*F\n+ 1 MainUserOrderItem.kt\ncom/sma/smartv3/ui/me/item/MainUserOrderItem\n*L\n118#1:270,2\n118#1:272\n141#1:273,2\n141#1:275\n202#1:284\n202#1:277,7\n202#1:285,3\n202#1:288,7\n202#1:295\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainUserOrderItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainUserOrderItem.kt\ncom/sma/smartv3/ui/me/item/MainUserOrderItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,269:1\n93#2,2:270\n90#2:272\n93#2,2:273\n90#2:275\n1#3:276\n1#3:284\n87#4,7:277\n94#4,3:285\n70#4,7:288\n97#4:295\n*S KotlinDebug\n*F\n+ 1 MainUserOrderItem.kt\ncom/sma/smartv3/ui/me/item/MainUserOrderItem\n*L\n118#1:270,2\n118#1:272\n141#1:273,2\n141#1:275\n202#1:284\n202#1:277,7\n202#1:285,3\n202#1:288,7\n202#1:295\n*E\n"
    }
.end annotation


# instance fields
.field public btPointsDetail:Landroid/view/View;

.field public btRecharge:Landroid/view/View;

.field public btUserOrder:Landroid/view/View;

.field private final initEvent:Z

.field public layoutPoints:Landroid/view/View;

.field private mOnClick:Landroid/view/View$OnClickListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public rvVipInterests:Landroidx/recyclerview/widget/RecyclerView;

.field public tvBenefitPackage:Lcom/sma/smartv3/view/text/PFMedium;

.field public tvBenefitPackageTip:Lcom/sma/smartv3/view/text/PFMedium;

.field public tvRecharge:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->initEvent:Z

    return-void
.end method

.method public static synthetic IiI10X(Landroid/content/Context;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->toWatchFaceActivity$lambda$0(Landroid/content/Context;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(I)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->toWatchFaceActivity$lambda$0$0(I)V

    return-void
.end method

.method private static final toWatchFaceActivity$lambda$0(Landroid/content/Context;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p2, p0}, Lcom/android/mltcode/paycertificationapi/i72;->OOIX(Landroid/app/Activity;)V

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/x30;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/x30;-><init>(I)V

    const-wide/16 v0, 0x1f4

    invoke-virtual {p0, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final toWatchFaceActivity$lambda$0$0(I)V
    .locals 1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "FACE_DIAL_INDEX"

    invoke-static {v0, p0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 4
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0186

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->setBtRecharge(Landroid/view/View;)V

    const v1, 0x7f0a0185

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->setBtPointsDetail(Landroid/view/View;)V

    const v2, 0x7f0a018d

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->setBtUserOrder(Landroid/view/View;)V

    const v3, 0x7f0a0c0f

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->setTvRecharge(Landroid/widget/TextView;)V

    const v3, 0x7f0a0828

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->setLayoutPoints(Landroid/view/View;)V

    const v3, 0x7f0a18dd

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v3, Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->setTvBenefitPackage(Lcom/sma/smartv3/view/text/PFMedium;)V

    const v3, 0x7f0a18de

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v3, Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->setTvBenefitPackageTip(Lcom/sma/smartv3/view/text/PFMedium;)V

    const v3, 0x7f0a18df

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->setRvVipInterests(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final getBtPointsDetail()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->btPointsDetail:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btPointsDetail"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBtRecharge()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->btRecharge:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btRecharge"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBtUserOrder()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->btUserOrder:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "btUserOrder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->initEvent:Z

    return v0
.end method

.method public final getLayoutPoints()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->layoutPoints:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "layoutPoints"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMOnClick()Landroid/view/View$OnClickListener;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->mOnClick:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public final getRvVipInterests()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->rvVipInterests:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rvVipInterests"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTvBenefitPackage()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->tvBenefitPackage:Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvBenefitPackage"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTvBenefitPackageTip()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->tvBenefitPackageTip:Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvBenefitPackageTip"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTvRecharge()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->tvRecharge:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tvRecharge"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final initRecyclerView()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getRvVipInterests()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getRvVipInterests()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getRvVipInterests()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/sma/smartv3/model/UserOrderKt;->getVipBenefitList()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;

    invoke-direct {v2, p0, v0, v1}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem$initRecyclerView$mAdapter$1;-><init>(Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getRvVipInterests()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public initView()V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->O101()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getLayoutPoints()Landroid/view/View;

    move-result-object v1

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070096

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-static {v1, v2}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOX1()Z

    move-result v0

    const v1, 0x7f140c5b

    const/4 v2, 0x0

    const/16 v3, 0x5f

    const/16 v4, 0x8

    if-eqz v0, :cond_3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "USER_MEMBER"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, Lcom/sma/smartv3/model/UserMember;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/sma/smartv3/model/UserMember;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getGetMemberFlag()Z

    move-result v3

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getLatestDateTime()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-lez v3, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvBenefitPackage()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvBenefitPackageTip()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getServerDateTime()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getLatestDateTime()J

    move-result-wide v5

    cmp-long v2, v2, v5

    if-lez v2, :cond_1

    const v0, 0x7f1400ca

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const v2, 0x7f141491

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I0IIOi()Ljava/text/SimpleDateFormat;

    move-result-object v3

    new-instance v5, Ljava/util/Date;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/UserMember;->getLatestDateTime()J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvRecharge()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f14118d

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvBenefitPackage()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvBenefitPackageTip()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f14025e

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvRecharge()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getBtPointsDetail()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_3
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "USER_POINTS"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, Lcom/sma/smartv3/model/AccountPoints;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_4
    check-cast v0, Lcom/sma/smartv3/model/AccountPoints;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AccountPoints;->getGetPointFlag()I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvRecharge()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvBenefitPackageTip()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140f0b

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvBenefitPackage()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getBtPointsDetail()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->initRecyclerView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->pointDetailBg()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0fc5

    return v0
.end method

.method public final onGetFreePoints(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "USER_FREE_POINTS"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "onGetFreePoints"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->initView()V

    return-void
.end method

.method public final onLoginDone(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "ALREADY_LOGIN"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->initView()V

    return-void
.end method

.method public final onThemeChange(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "THEME_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onThemeChange"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->IOX1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getLayoutPoints()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getLayoutPoints()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0816da

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->pointDetailBg()V

    return-void
.end method

.method public final onUserMemberChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "USER_MEMBER"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "onUserMemberChange"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->initView()V

    return-void
.end method

.method public final onUserPointsChange(Ljava/lang/Object;)V
    .locals 1
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

    const-string v0, "onUserPointsChange"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->initView()V

    return-void
.end method

.method public final pointDetailBg()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getBtPointsDetail()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getBtPointsDetail()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f060565

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvRecharge()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->getTvRecharge()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f060563

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public final setBtPointsDetail(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->btPointsDetail:Landroid/view/View;

    return-void
.end method

.method public final setBtRecharge(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->btRecharge:Landroid/view/View;

    return-void
.end method

.method public final setBtUserOrder(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->btUserOrder:Landroid/view/View;

    return-void
.end method

.method public final setLayoutPoints(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->layoutPoints:Landroid/view/View;

    return-void
.end method

.method public final setMOnClick(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->mOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final setRvVipInterests(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->rvVipInterests:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public final setTvBenefitPackage(Lcom/sma/smartv3/view/text/PFMedium;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->tvBenefitPackage:Lcom/sma/smartv3/view/text/PFMedium;

    return-void
.end method

.method public final setTvBenefitPackageTip(Lcom/sma/smartv3/view/text/PFMedium;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->tvBenefitPackageTip:Lcom/sma/smartv3/view/text/PFMedium;

    return-void
.end method

.method public final setTvRecharge(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->tvRecharge:Landroid/widget/TextView;

    return-void
.end method

.method public final toVipBenefitIntent(Landroid/content/Context;I)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/model/VipBenefitType;->AI:Lcom/sma/smartv3/model/VipBenefitType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/VipBenefitType;->getType()I

    move-result v0

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    invoke-static {}, Lcom/sma/smartv3/model/AIFunctionDataKt;->getAIFunction()Ljava/util/List;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/model/AIFunction;

    invoke-static {p1, p2}, Lcom/sma/smartv3/model/AIFunctionDataKt;->toAIFunction(Landroid/app/Activity;Lcom/sma/smartv3/model/AIFunction;)V

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/model/VipBenefitType;->AIGC:Lcom/sma/smartv3/model/VipBenefitType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/VipBenefitType;->getType()I

    move-result v0

    if-ne p2, v0, :cond_1

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->toWatchFaceActivity(Landroid/content/Context;I)V

    return-void

    :cond_1
    sget-object v0, Lcom/sma/smartv3/model/VipBenefitType;->DIAL:Lcom/sma/smartv3/model/VipBenefitType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/VipBenefitType;->getType()I

    move-result v0

    if-ne p2, v0, :cond_2

    invoke-virtual {p0, p1, v1}, Lcom/sma/smartv3/ui/me/item/MainUserOrderItem;->toWatchFaceActivity(Landroid/content/Context;I)V

    return-void

    :cond_2
    sget-object v0, Lcom/sma/smartv3/model/VipBenefitType;->BUY_VIP:Lcom/sma/smartv3/model/VipBenefitType;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/VipBenefitType;->getType()I

    move-result v0

    if-ne p2, v0, :cond_3

    check-cast p1, Landroid/app/Activity;

    sget-object p2, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p2, v1, v1, v0, v1}, Lcom/sma/smartv3/biz/OrderManager;->X11iII1O1(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v0, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "mArg1"

    const/4 v2, 0x2

    invoke-virtual {v0, p2, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "mArg2"

    invoke-virtual {v0, p2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p2, "mArg3"

    invoke-virtual {v0, p2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p2, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {p2, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_3
    return-void
.end method

.method public final toWatchFaceActivity(Landroid/content/Context;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/w30;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/w30;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-static {v1, v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method
