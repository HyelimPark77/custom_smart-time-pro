.class public final Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;
.super Lcom/sma/smartv3/ui/ai/AIRecordsActivity;
.source "SourceFile"


# instance fields
.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mAIRecordsViewData:Lcom/sma/smartv3/model/AIRecordsViewData;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0iIXiI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i0iIXiI;-><init>(Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->setShowItemClick(Z)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method public final getMAIRecordsViewData()Lcom/sma/smartv3/model/AIRecordsViewData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->mAIRecordsViewData:Lcom/sma/smartv3/model/AIRecordsViewData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mAIRecordsViewData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.AIRecordsViewData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/AIRecordsViewData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->setMAIRecordsViewData(Lcom/sma/smartv3/model/AIRecordsViewData;)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AIRecordsViewData;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->setMAdapterData(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->getMAIRecordsViewData()Lcom/sma/smartv3/model/AIRecordsViewData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->getMAdapterData()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const v1, 0x7f140cde

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08062f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d002b

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f14112b

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->getMAIRecordsViewData()Lcom/sma/smartv3/model/AIRecordsViewData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIRecordsViewData;->getFirst()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " : "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f140c45

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->getMAIRecordsViewData()Lcom/sma/smartv3/model/AIRecordsViewData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AIRecordsViewData;->getLast()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v1

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->share(Ljava/lang/String;)V

    return-void
.end method

.method public onTitleRightClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->getMAIRecordsViewData()Lcom/sma/smartv3/model/AIRecordsViewData;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIRecordsViewData;->getFirst()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->getMAIRecordsViewData()Lcom/sma/smartv3/model/AIRecordsViewData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIRecordsViewData;->getLast()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/sma/smartv3/ui/ai/AIRecordsActivity;->showDeletePopup(Lcom/sma/smartv3/db/entity/AIRecords;Lcom/sma/smartv3/db/entity/AIRecords;I)V

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

.method public final setMAIRecordsViewData(Lcom/sma/smartv3/model/AIRecordsViewData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AIRecordsViewData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIRecordsDetailActivity;->mAIRecordsViewData:Lcom/sma/smartv3/model/AIRecordsViewData;

    return-void
.end method
