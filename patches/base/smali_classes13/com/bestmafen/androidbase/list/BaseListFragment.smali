.class public abstract Lcom/bestmafen/androidbase/list/BaseListFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/np;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bestmafen/androidbase/base/BaseFragment;",
        "Lcom/android/mltcode/paycertificationapi/np<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseListFragment.kt\ncom/bestmafen/androidbase/list/BaseListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseListFragment.kt\ncom/bestmafen/androidbase/list/BaseListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"
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

.field protected mListAdapter:Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/XII0Oi10O<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected mListView:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListFragment;->getMList()Ljava/util/List;

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

    iget-object v0, p0, Lcom/bestmafen/androidbase/list/BaseListFragment;->mList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/XII0Oi10O<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/list/BaseListFragment;->mListAdapter:Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mListAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMListView()Landroid/widget/ListView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/list/BaseListFragment;->mListView:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mListView"

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

    sget v1, Lcom/bestmafen/androidbase/R$id;->list_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.ListView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/list/BaseListFragment;->setMListView(Landroid/widget/ListView;)V

    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/mc;->initList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/list/BaseListFragment;->setMList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-interface {p0}, Lcom/android/mltcode/paycertificationapi/mc;->itemLayoutId()I

    move-result v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListFragment;->getMList()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/bestmafen/androidbase/list/BaseListFragment$OXO1;

    invoke-direct {v3, p0, v0, v1, v2}, Lcom/bestmafen/androidbase/list/BaseListFragment$OXO1;-><init>(Lcom/bestmafen/androidbase/list/BaseListFragment;Landroid/app/Activity;ILjava/util/List;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListFragment;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/androidbase/list/BaseListFragment;->setMListAdapter(Lcom/android/mltcode/paycertificationapi/XII0Oi10O;)V

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

    iput-object p1, p0, Lcom/bestmafen/androidbase/list/BaseListFragment;->mList:Ljava/util/List;

    return-void
.end method

.method public final setMListAdapter(Lcom/android/mltcode/paycertificationapi/XII0Oi10O;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/XII0Oi10O<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/androidbase/list/BaseListFragment;->mListAdapter:Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    return-void
.end method

.method public final setMListView(Landroid/widget/ListView;)V
    .locals 1
    .param p1    # Landroid/widget/ListView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/androidbase/list/BaseListFragment;->mListView:Landroid/widget/ListView;

    return-void
.end method
