.class public Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;
.super Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTimeElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1869#2,2:80\n*S KotlinDebug\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment\n*L\n74#1:80,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTimeElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1869#2,2:80\n*S KotlinDebug\n*F\n+ 1 TimeElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment\n*L\n74#1:80,2\n*E\n"
    }
.end annotation


# instance fields
.field private final callback:Lcom/android/mltcode/paycertificationapi/IXI011X11;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/IXI011X11<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final colors:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final dialSelect0$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dialSelectStatus0$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final isRound:Z

.field private final rv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;ZLcom/android/mltcode/paycertificationapi/IXI011X11;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/android/mltcode/paycertificationapi/IXI011X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;Z",
            "Lcom/android/mltcode/paycertificationapi/IXI011X11<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "colors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->colors:Ljava/util/List;

    iput-boolean p2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->isRound:Z

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->callback:Lcom/android/mltcode/paycertificationapi/IXI011X11;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/us5;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/us5;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->dialSelect0$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/vs5;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/vs5;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->dialSelectStatus0$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/ws5;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/ws5;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->rv$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->dialSelectStatus0_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->dialSelect0_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->rv_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method private static final dialSelect0_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02f8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final dialSelectStatus0_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02fe

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;->getMOnViewClickListener()Landroid/view/View$OnClickListener;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method


# virtual methods
.method public final getCallback()Lcom/android/mltcode/paycertificationapi/IXI011X11;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/IXI011X11<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->callback:Lcom/android/mltcode/paycertificationapi/IXI011X11;

    return-object v0
.end method

.method public final getColors()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->colors:Ljava/util/List;

    return-object v0
.end method

.method public final getDialSelect0()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->dialSelect0$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getDialSelectStatus0()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->dialSelectStatus0$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getRv()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

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

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->isRound:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->getDialSelect0()Landroid/widget/RelativeLayout;

    move-result-object v0

    const v1, 0x7f0816c4

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->getDialSelect0()Landroid/widget/RelativeLayout;

    move-result-object v0

    const v1, 0x7f0816c5

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->colors:Ljava/util/List;

    new-instance v3, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment$initView$2;

    invoke-direct {v3, p0, v1, v2}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment$initView$2;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->getDialSelect0()Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xs5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xs5;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final isRound()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->isRound:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0f68

    return v0
.end method

.method public reset()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter<com.sma.smartv3.model.ResourcesIdInfo>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v1

    const-string v2, "getDatas(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/model/ResourcesIdInfo;->setSelect(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->getDialSelectStatus0()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
