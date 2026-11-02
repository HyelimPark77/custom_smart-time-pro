.class public final Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/jc<",
        "Lcom/sma/smartv3/db/entity/AIRecords;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->share(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;->IiI10X(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;I)V
    .locals 3

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "mAIRecords"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0229

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMTime()J

    move-result-wide v1

    invoke-virtual {v0, p3, v1, v2}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isShowTime(Landroid/widget/TextView;J)V

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    const p3, 0x7f1414b7

    invoke-virtual {v0, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    const v0, 0x7f0a0cf4

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;

    invoke-static {v1}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;->access$getMContext$p$s-1623866647(Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0607a5

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    const v0, 0x7f0a0cf5

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a0465

    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMStatus()I

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    :cond_1
    const/4 p2, 0x4

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiiXiI0I;

    invoke-direct {v0, p2, p3}, Lcom/android/mltcode/paycertificationapi/IiiXiI0I;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;->XOO0ii0(Lcom/sma/smartv3/db/entity/AIRecords;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0eb4

    return v0
.end method

.method public XOO0ii0(Lcom/sma/smartv3/db/entity/AIRecords;I)Z
    .locals 1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMType()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return p2
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XIi00iiXO;->O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;I)V

    return-void
.end method
