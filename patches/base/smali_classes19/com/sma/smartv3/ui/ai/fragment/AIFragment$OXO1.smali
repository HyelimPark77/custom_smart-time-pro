.class public final Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment$showData$1$1$4$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1869#2,2:171\n*S KotlinDebug\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment$showData$1$1$4$1$1\n*L\n118#1:171,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment$showData$1$1$4$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1869#2,2:171\n*S KotlinDebug\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment$showData$1$1$4$1$1\n*L\n118#1:171,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai/fragment/AIFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/fragment/AIFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/fragment/AIFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;->XIi00iiXO(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XIi00iiXO(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$render"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 6

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/fragment/AIFragment;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    if-eq p1, v1, :cond_0

    sget-object p1, Lcom/sma/smartv3/model/AIFunctionCat;->AMUSEMENT:Lcom/sma/smartv3/model/AIFunctionCat;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/model/AIFunctionCat;->WORK:Lcom/sma/smartv3/model/AIFunctionCat;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/sma/smartv3/model/AIFunctionCat;->LIFE:Lcom/sma/smartv3/model/AIFunctionCat;

    :goto_0
    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->setMCurCat(Lcom/sma/smartv3/model/AIFunctionCat;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/fragment/AIFragment;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->getDataItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v2, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/fragment/AIFragment;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-virtual {v3}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsGroupHead()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemGroups()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->getITEM_GROUPS_TAG()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/fragment/AIFragment;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/angcyo/dsladapter/DslAdapter;->removeItem(Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/fragment/AIFragment;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/fragment/AIFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->getMCurCat()Lcom/sma/smartv3/model/AIFunctionCat;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;->showAIFunction(Lcom/sma/smartv3/model/AIFunctionCat;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/fragment/AIFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/fragment/AIFragment;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iIi1;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/iIi1;-><init>()V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
