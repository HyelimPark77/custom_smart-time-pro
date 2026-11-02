.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/miguelcatalan/materialsearchview/MaterialSearchView$I0IIOi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperOtaSelectBleNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1869#2,2:194\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$3\n*L\n103#1:194,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperOtaSelectBleNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1869#2,2:194\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$3\n*L\n103#1:194,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 6

    const-string v0, "newText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onQueryTextChange => "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getSearchList$p(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getDataList$p(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x1

    invoke-static {v4, p1, v5}, Lkotlin/text/StringsKt__StringsKt;->iOiXX(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v3}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getSearchList$p(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getSearchList$p(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getRecyclerView(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-ne p1, v2, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getRecyclerView(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getSelect_group_ll(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getRecyclerView(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getSelect_group_ll(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getMRecyclerAdapter$p(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getRecyclerView(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Lcom/l4digital/fastscroll/FastScrollRecyclerView;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/l4digital/fastscroll/FastScrollRecyclerView;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;->access$getSelect_group_ll(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity;)Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    :goto_2
    return v1
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
