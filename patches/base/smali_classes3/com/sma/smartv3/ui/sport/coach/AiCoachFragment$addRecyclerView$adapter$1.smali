.class public final Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->addRecyclerView(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiCoachFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1869#2,2:473\n1563#2:475\n1634#2,3:476\n*S KotlinDebug\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1\n*L\n418#1:473,2\n432#1:475\n432#1:476,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAiCoachFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1869#2,2:473\n1563#2:475\n1634#2,3:476\n*S KotlinDebug\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1\n*L\n418#1:473,2\n432#1:475\n432#1:476,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;>;",
            "Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    const p2, 0x7f0d0eb9

    invoke-direct {p0, p3, p2, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->convert$lambda$0$0$2(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;ILcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->convert$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;ILcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;ILcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;Landroid/view/View;)V
    .locals 6

    iget-object p0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    if-eqz p0, :cond_3

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p4

    invoke-virtual {p4}, Lcom/angcyo/dsladapter/DslAdapter;->getDataItems()Ljava/util/List;

    move-result-object p4

    check-cast p4, Ljava/lang/Iterable;

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsGroupHead()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemGroups()Ljava/util/List;

    move-result-object v1

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->access$getITEM_GROUPS_TAG$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p4

    invoke-virtual {p4, p0}, Lcom/angcyo/dsladapter/DslAdapter;->removeItem(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p4, 0x1

    const/4 v0, 0x0

    invoke-static {p0, v0, p4, v0}, Lcom/angcyo/dsladapter/DslAdapter;->updateItemDepend$default(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/XIi00iiXO;ILjava/lang/Object;)V

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->access$setCurPosition$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;I)V

    invoke-virtual {p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getMLessonIndex()I

    move-result p0

    invoke-static {p1, p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->access$setCurDataPosition$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;I)V

    invoke-virtual {p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getTimeDay()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->access$setCurTimeDay$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->setReachedTarget(Z)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->access$getMListAdapter$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p0, p3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    sget-object p3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->access$showPlanFunction(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v3, Lcom/android/mltcode/paycertificationapi/I1IOiXO1i;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/I1IOiXO1i;-><init>()V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method private static final convert$lambda$0$0$2(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
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
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;I)V
    .locals 9

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0b9a

    .line 2
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0a0b99

    .line 3
    invoke-virtual {p1, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getOfWeek()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getTimeDay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f0a0932

    .line 6
    invoke-virtual {p1, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    .line 7
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/16 v4, 0x8

    .line 8
    new-array v4, v4, [F

    fill-array-data v4, :array_0

    .line 9
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 10
    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    sget-object v4, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailySchedule()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getMLessonIndex()I

    move-result v6

    rem-int/lit8 v6, v6, 0x7

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-ne v4, v5, :cond_0

    .line 11
    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f0600af

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    goto :goto_0

    .line 12
    :cond_0
    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f0600b3

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    :goto_0
    const/4 v6, 0x0

    .line 13
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 14
    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f06006c

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 15
    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 16
    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-static {v6}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->access$getCurPosition$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)I

    move-result v6

    if-ne p3, v6, :cond_1

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getTimeDay()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-static {v7}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->access$getCurTimeDay$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 17
    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f0600b4

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 18
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 19
    invoke-virtual {v7, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 20
    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v8, 0x7f06024a

    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v7, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 21
    invoke-virtual {v1, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 22
    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 23
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 24
    :cond_1
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 25
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 26
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->this$0:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XI0XXXiI;

    invoke-direct {v1, p0, v0, p3, p2}, Lcom/android/mltcode/paycertificationapi/XI0XXXiI;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;ILcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :array_0
    .array-data 4
        0x42700000    # 60.0f
        0x42700000    # 60.0f
        0x42700000    # 60.0f
        0x42700000    # 60.0f
        0x42700000    # 60.0f
        0x42700000    # 60.0f
        0x42700000    # 60.0f
        0x42700000    # 60.0f
    .end array-data
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;I)V

    return-void
.end method
