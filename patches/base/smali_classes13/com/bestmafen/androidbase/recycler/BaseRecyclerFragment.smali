.class public abstract Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/ag3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bestmafen/androidbase/base/BaseFragment;",
        "Lcom/android/mltcode/paycertificationapi/ag3<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseRecyclerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRecyclerFragment.kt\ncom/bestmafen/androidbase/recycler/BaseRecyclerFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseRecyclerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRecyclerFragment.kt\ncom/bestmafen/androidbase/recycler/BaseRecyclerFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"
    }
.end annotation


# instance fields
.field protected mList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getMList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->mList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMRecyclerAdapter()Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mRecyclerAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mRecyclerView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 4
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/bestmafen/androidbase/R$id;->recycler_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->setMRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/mc;->initList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->setMList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/mc;->itemLayoutId()I

    move-result v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMList()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment$initView$1;

    invoke-direct {v3, p0, v0, v1, v2}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment$initView$1;-><init>(Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;Landroid/app/Activity;ILjava/util/List;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->setMRecyclerAdapter(Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;)V

    return-void
.end method

.method public final setMList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->mList:Ljava/util/List;

    return-void
.end method

.method public final setMRecyclerAdapter(Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;)V
    .locals 1
    .param p1    # Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->mRecyclerAdapter:Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    return-void
.end method

.method public final setMRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/androidbase/recycler/BaseRecyclerFragment;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method
