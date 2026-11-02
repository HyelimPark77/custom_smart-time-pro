.class public final Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResourceRenewalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceRenewalActivity.kt\ncom/sma/smartv3/ui/device/ResourceRenewalActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n1878#2,3:245\n87#3,7:248\n94#3,3:256\n70#3,7:259\n97#3:266\n1#4:255\n*S KotlinDebug\n*F\n+ 1 ResourceRenewalActivity.kt\ncom/sma/smartv3/ui/device/ResourceRenewalActivity\n*L\n173#1:245,3\n192#1:248,7\n192#1:256,3\n192#1:259,7\n192#1:266\n192#1:255\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nResourceRenewalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceRenewalActivity.kt\ncom/sma/smartv3/ui/device/ResourceRenewalActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n1878#2,3:245\n87#3,7:248\n94#3,3:256\n70#3,7:259\n97#3:266\n1#4:255\n*S KotlinDebug\n*F\n+ 1 ResourceRenewalActivity.kt\ncom/sma/smartv3/ui/device/ResourceRenewalActivity\n*L\n173#1:245,3\n192#1:248,7\n192#1:256,3\n192#1:259,7\n192#1:266\n192#1:255\n*E\n"
    }
.end annotation


# instance fields
.field private isNeedToDownloadFile:Z

.field private isSync:Z

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/ResourceRenewalActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEmptyImg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mEmptyTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mResourceId:I

.field private final mSwipeRefreshLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final renewalList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/AppFileDetail;",
            ">;"
        }
    .end annotation
.end field

.field private final titleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final viewModel:Lcom/sma/smartv3/ui/device/model/ResourceRenewal;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ol3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ol3;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mEmptyImg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rl3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rl3;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mEmptyTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sl3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sl3;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->titleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tl3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tl3;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mSwipeRefreshLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;

    invoke-direct {v0}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    const-class v1, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;->create(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/ResourceRenewal;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mResourceId:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->renewalList:Ljava/util/ArrayList;

    new-instance v0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/ResourceRenewalActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mEmptyTv_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Lcom/sma/smartv3/model/AppFileDetail;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->findData$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Lcom/sma/smartv3/model/AppFileDetail;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/model/AppFileDetail;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->findData$lambda$0$0$0(Lcom/sma/smartv3/model/AppFileDetail;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->titleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->showList$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Ljava/util/ArrayList;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->showList$lambda$0$0$0(Ljava/util/ArrayList;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/model/AppFileDetail;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;ILcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->findData$lambda$0$0(Lcom/sma/smartv3/model/AppFileDetail;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;ILcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->showList$lambda$0$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;ILandroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->findData$lambda$0$0$1(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;ILandroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mEmptyImg_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final findData(Ljava/util/ArrayList;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged",
            "SetTextI18n"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/AppFileDetail;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-gez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v1, Lcom/sma/smartv3/model/AppFileDetail;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/ResourceRenewal;

    iget v5, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mResourceId:I

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getLayoutId(I)I

    move-result v4

    new-instance v5, Lcom/android/mltcode/paycertificationapi/pl3;

    invoke-direct {v5, v1, p0, v0}, Lcom/android/mltcode/paycertificationapi/pl3;-><init>(Lcom/sma/smartv3/model/AppFileDetail;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;I)V

    invoke-static {v3, v4, v5}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move v0, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method private static final findData$lambda$0$0(Lcom/sma/smartv3/model/AppFileDetail;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;ILcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yl3;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/yl3;-><init>(Lcom/sma/smartv3/model/AppFileDetail;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;I)V

    invoke-virtual {p3, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance p0, Lcom/android/mltcode/paycertificationapi/zl3;

    invoke-direct {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/zl3;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;I)V

    invoke-virtual {p3, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$0(Lcom/sma/smartv3/model/AppFileDetail;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;ILcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 4

    const-string p4, "itemHolder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "<unused var>"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p4, 0x7f0a05cf

    invoke-virtual {p3, p4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p4

    const p5, 0x7f0a05ce

    invoke-virtual {p3, p5}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p5

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppGroupId()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p4, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget p6, p1, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mResourceId:I

    const/4 v0, -0x1

    if-eq p6, v0, :cond_4

    if-eqz p4, :cond_1

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppName()Ljava/lang/String;

    move-result-object p6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    if-eqz p5, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/model/AppFileDetail;->getAppSize()D

    move-result-wide v0

    const/16 p2, 0x3fc

    int-to-double v2, p2

    mul-double/2addr v0, v2

    double-to-int p2, v0

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "kb"

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p5, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const p2, 0x7f0a0cf8

    invoke-virtual {p3, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p2

    if-eqz p2, :cond_3

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    if-eqz p2, :cond_4

    new-instance p3, Lcom/android/mltcode/paycertificationapi/wl3;

    invoke-direct {p3, p1, p0}, Lcom/android/mltcode/paycertificationapi/wl3;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Lcom/sma/smartv3/model/AppFileDetail;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$0$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Lcom/sma/smartv3/model/AppFileDetail;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->onTvRenew(Lcom/sma/smartv3/model/AppFileDetail;)V

    return-void
.end method

.method private static final findData$lambda$0$0$1(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;ILandroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg2"

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getMEmptyImg()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mEmptyImg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMEmptyTv()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mEmptyTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMSwipeRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mSwipeRefreshLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-object v0
.end method

.method private final getTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->titleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mSwipeRefreshLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->renewalList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->renewalList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->renewalList:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "renewalList.size"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->renewalList:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->showList(Ljava/util/ArrayList;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mEmptyImg_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0666

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mEmptyTv_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0cfb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mSwipeRefreshLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 1

    const v0, 0x7f0a0b16

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-object p0
.end method

.method private final onTvRenew(Lcom/sma/smartv3/model/AppFileDetail;)V
    .locals 2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPack()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->syncData()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/ResourceRenewal;

    iget v1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mResourceId:I

    invoke-virtual {v0, v1, p1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->downloadFile(ILcom/sma/smartv3/model/AppFileDetail;)V

    return-void

    :cond_0
    const p1, 0x7f141008

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method private final showList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/AppFileDetail;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vl3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/vl3;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showList$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xl3;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/xl3;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;)V

    const-wide/16 p0, 0x12c

    invoke-virtual {p2, p0, p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ql3;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/ql3;-><init>(Ljava/util/ArrayList;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0(Ljava/util/ArrayList;Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    const/16 v0, 0x8

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->getMEmptyImg()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->getMEmptyTv()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->getMEmptyImg()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->getMEmptyTv()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->findData(Ljava/util/ArrayList;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final syncData()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c72;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v1, v3}, Lcom/android/mltcode/paycertificationapi/c72;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f14014c

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/c72;->I1(I)V

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/c72;->OX(I)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_0
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p0, v1, v1, v0, v3}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->syncProgress$default(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;FFILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static synthetic syncFailed$default(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->syncFailed(I)V

    return-void
.end method

.method public static synthetic syncProgress$default(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;FFILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/high16 p2, 0x42c80000    # 100.0f

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->syncProgress(FF)V

    return-void
.end method

.method private static final titleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method


# virtual methods
.method public final getMProgressPop()Lcom/android/mltcode/paycertificationapi/c72;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-object v0
.end method

.method public final getRenewalList()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/AppFileDetail;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->renewalList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mResourceId:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "savedInstanceState size"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/ResourceRenewalActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->getTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/ResourceRenewal;

    iget v2, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mResourceId:I

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getTitleString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->getMSwipeRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/ResourceRenewal;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getRenewalLiveData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ul3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ul3;-><init>(Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;)V

    new-instance v2, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity$XIi00iiXO;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity$XIi00iiXO;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final isNeedToDownloadFile()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->isNeedToDownloadFile:Z

    return v0
.end method

.method public final isSync()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->isSync:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00f1

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/ResourceRenewalActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->viewModel:Lcom/sma/smartv3/ui/device/model/ResourceRenewal;

    iget v1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mResourceId:I

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getData(I)V

    return-void
.end method

.method public onRefresh()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onRefresh()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

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

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const v0, 0x7f0a0b16

    return v0
.end method

.method public final setMProgressPop(Lcom/android/mltcode/paycertificationapi/c72;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/c72;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    return-void
.end method

.method public final setNeedToDownloadFile(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->isNeedToDownloadFile:Z

    return-void
.end method

.method public final setSync(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->isSync:Z

    return-void
.end method

.method public final syncFailed(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/OOX00;->iO(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final syncProgress(FF)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_0

    div-float v1, p1, p2

    const/16 v2, 0x64

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/c72;->OX(I)V

    :cond_0
    cmpg-float v0, p2, p1

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->mProgressPop:Lcom/android/mltcode/paycertificationapi/c72;

    sget-object v1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/initializer/BleInitializer;->I1Ii(Z)V

    iput-boolean v2, p0, Lcom/sma/smartv3/ui/device/ResourceRenewalActivity;->isSync:Z

    const/4 v1, 0x0

    cmpg-float p1, p1, v1

    if-nez p1, :cond_2

    cmpg-float p1, p2, v1

    if-nez p1, :cond_2

    return-void

    :cond_2
    const-string p1, "add_app_store_success"

    const/4 p2, 0x2

    invoke-static {p1, v0, p2, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method
