.class public final Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;
.super Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPointerElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1869#2,2:121\n1869#2,2:123\n*S KotlinDebug\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment\n*L\n111#1:121,2\n116#1:123,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPointerElementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1869#2,2:121\n1869#2,2:123\n*S KotlinDebug\n*F\n+ 1 PointerElementFragment.kt\ncom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment\n*L\n111#1:121,2\n116#1:123,2\n*E\n"
    }
.end annotation


# instance fields
.field private final callback:Lcom/android/mltcode/paycertificationapi/az1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/az1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final isRound:Z

.field private final pointers:Ljava/util/List;
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

.field private final rvPointer$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rvScale$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final scales:Ljava/util/List;
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


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;ZLcom/android/mltcode/paycertificationapi/az1;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/android/mltcode/paycertificationapi/az1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;Z",
            "Lcom/android/mltcode/paycertificationapi/az1<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pointers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scales"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/BaseElementFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->pointers:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->scales:Ljava/util/List;

    iput-boolean p3, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->isRound:Z

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->callback:Lcom/android/mltcode/paycertificationapi/az1;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/bz1;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/bz1;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->rvPointer$delegate:Lkotlin/Lazy;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/cz1;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/cz1;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;)V

    invoke-static {p1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->rvScale$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->rvPointer_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method private final getRvPointer()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->rvPointer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getRvScale()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->rvScale$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->rvScale_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method private static final rvPointer_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09c2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final rvScale_delegate$lambda$0(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09c3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method


# virtual methods
.method public final getCallback()Lcom/android/mltcode/paycertificationapi/az1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/az1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->callback:Lcom/android/mltcode/paycertificationapi/az1;

    return-object v0
.end method

.method public final getPointers()Ljava/util/List;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->pointers:Ljava/util/List;

    return-object v0
.end method

.method public final getScales()Ljava/util/List;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->scales:Ljava/util/List;

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
    .locals 7

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->getRvPointer()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->getRvScale()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v1, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->getRvPointer()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->isRound:Z

    const v3, 0x7f0d0f35

    const v4, 0x7f0d0f34

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    iget-object v5, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->pointers:Ljava/util/List;

    new-instance v6, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;

    invoke-direct {v6, p0, v1, v2, v5}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$3;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;Landroidx/fragment/app/FragmentActivity;ILjava/util/List;)V

    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->getRvScale()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->isRound:Z

    if-eqz v2, :cond_1

    move v3, v4

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->scales:Ljava/util/List;

    new-instance v4, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$4;

    invoke-direct {v4, p0, v1, v3, v2}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment$initView$4;-><init>(Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;Landroidx/fragment/app/FragmentActivity;ILjava/util/List;)V

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public final isRound()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->isRound:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0f67

    return v0
.end method

.method public reset()V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->getRvPointer()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter<com.sma.smartv3.model.ResourcesIdInfo>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v2

    const-string v3, "getDatas(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;->setSelect(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/watchface/fragment/PointerElementFragment;->getRvScale()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->getDatas()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v2, v5}, Lcom/sma/smartv3/model/ResourcesIdInfo;->setSelect(Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
