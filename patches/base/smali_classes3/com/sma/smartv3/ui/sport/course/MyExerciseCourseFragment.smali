.class public final Lcom/sma/smartv3/ui/sport/course/MyExerciseCourseFragment;
.super Lcom/sma/smartv3/ui/sport/course/MyHaveCourseFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/MyHaveCourseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitBaseLayoutAfter()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    const-string v0, "222"

    const-string v1, "333"

    const-string v2, "111"

    filled-new-array {v2, v0, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/course/MyHaveCourseFragment;->showData(Ljava/util/List;)V

    return-void
.end method
