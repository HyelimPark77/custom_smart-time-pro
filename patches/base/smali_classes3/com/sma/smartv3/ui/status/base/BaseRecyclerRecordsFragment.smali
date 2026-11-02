.class public abstract Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private adapterStatus:Lcom/angcyo/dsladapter/DslAdapterStatusItem;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private baseDslItemDecoration:Lcom/angcyo/dsladapter/DslItemDecoration;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public dslViewHolder:Lcom/angcyo/dsladapter/DslViewHolder;

.field private hoverItemDecoration:Lcom/angcyo/dsladapter/HoverItemDecoration;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public recyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field public refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;-><init>()V

    new-instance v0, Lcom/angcyo/dsladapter/HoverItemDecoration;

    invoke-direct {v0}, Lcom/angcyo/dsladapter/HoverItemDecoration;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->hoverItemDecoration:Lcom/angcyo/dsladapter/HoverItemDecoration;

    new-instance v1, Lcom/angcyo/dsladapter/DslItemDecoration;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/angcyo/dsladapter/DslItemDecoration;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->baseDslItemDecoration:Lcom/angcyo/dsladapter/DslItemDecoration;

    new-instance v0, Lcom/angcyo/dsladapter/DslAdapter;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->adapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setDslAdapterStatusItem(Lcom/angcyo/dsladapter/DslAdapterStatusItem;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    new-instance v0, Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    invoke-direct {v0}, Lcom/angcyo/dsladapter/DslAdapterStatusItem;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->adapterStatus:Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->initBaseLayout$lambda$1$0(Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;)V

    return-void
.end method

.method private static final initBaseLayout$lambda$1$0(Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->onRefresh()V

    return-void
.end method


# virtual methods
.method public adapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    invoke-direct {v0}, Lcom/angcyo/dsladapter/DslAdapterStatusItem;-><init>()V

    return-object v0
.end method

.method public final getAdapterStatus()Lcom/angcyo/dsladapter/DslAdapterStatusItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->adapterStatus:Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    return-object v0
.end method

.method public final getBaseDslItemDecoration()Lcom/angcyo/dsladapter/DslItemDecoration;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->baseDslItemDecoration:Lcom/angcyo/dsladapter/DslItemDecoration;

    return-object v0
.end method

.method public final getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    return-object v0
.end method

.method public final getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->dslViewHolder:Lcom/angcyo/dsladapter/DslViewHolder;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "dslViewHolder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getHoverItemDecoration()Lcom/angcyo/dsladapter/HoverItemDecoration;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->hoverItemDecoration:Lcom/angcyo/dsladapter/HoverItemDecoration;

    return-object v0
.end method

.method public final getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "recyclerView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "refreshLayout"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initBaseLayout(II)V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->setRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->baseDslItemDecoration:Lcom/angcyo/dsladapter/DslItemDecoration;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->hoverItemDecoration:Lcom/angcyo/dsladapter/HoverItemDecoration;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lcom/angcyo/dsladapter/HoverItemDecoration;->attachToRecyclerView$default(Lcom/angcyo/dsladapter/HoverItemDecoration;Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment$initBaseLayout$1$1;

    invoke-direct {v1, v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment$initBaseLayout$1$1;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->setRefreshLayout(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/i0I11;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/i0I11;-><init>(Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;)V

    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    :cond_1
    return-void
.end method

.method public initView()V
    .locals 5

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    new-instance v0, Lcom/angcyo/dsladapter/DslViewHolder;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/angcyo/dsladapter/DslViewHolder;-><init>(Landroid/view/View;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->setDslViewHolder(Lcom/angcyo/dsladapter/DslViewHolder;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->recyclerViewId()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->refreshLayoutId()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->initBaseLayout(II)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->onInitBaseLayoutAfter()V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 0

    return-void
.end method

.method public onRefresh()V
    .locals 0

    return-void
.end method

.method public abstract recyclerViewId()I
    .annotation build Landroidx/annotation/IdRes;
    .end annotation
.end method

.method public abstract refreshLayoutId()I
    .annotation build Landroidx/annotation/IdRes;
    .end annotation
.end method

.method public renderAdapter(Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/angcyo/dsladapter/DslAdapter;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "render"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public final setAdapterStatus(Lcom/angcyo/dsladapter/DslAdapterStatusItem;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslAdapterStatusItem;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->adapterStatus:Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    return-void
.end method

.method public final setBaseDslItemDecoration(Lcom/angcyo/dsladapter/DslItemDecoration;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslItemDecoration;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->baseDslItemDecoration:Lcom/angcyo/dsladapter/DslItemDecoration;

    return-void
.end method

.method public final setDslAdapter(Lcom/angcyo/dsladapter/DslAdapter;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    return-void
.end method

.method public final setDslViewHolder(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->dslViewHolder:Lcom/angcyo/dsladapter/DslViewHolder;

    return-void
.end method

.method public final setHoverItemDecoration(Lcom/angcyo/dsladapter/HoverItemDecoration;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/HoverItemDecoration;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->hoverItemDecoration:Lcom/angcyo/dsladapter/HoverItemDecoration;

    return-void
.end method

.method public final setRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public final setRefreshLayout(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 1
    .param p1    # Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseRecyclerRecordsFragment;->refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-void
.end method
