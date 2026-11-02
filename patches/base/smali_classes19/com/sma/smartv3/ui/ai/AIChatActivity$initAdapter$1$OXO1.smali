.class public final Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$OXO1;
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$OXO1;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public O00(Lcom/sma/smartv3/db/entity/AIRecords;I)Z
    .locals 1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMType()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return p2
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$OXO1;->O00(Lcom/sma/smartv3/db/entity/AIRecords;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0eb7

    return v0
.end method

.method public XO0O10(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;I)V
    .locals 3

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "mAIRecords"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a022a

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMTime()J

    move-result-wide v1

    invoke-virtual {v0, p3, v1, v2}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->isShowTime(Landroid/widget/TextView;J)V

    const p3, 0x7f0a0d0b

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$OXO1;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;

    invoke-static {p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;->access$getMContext$p$s-1623866647(Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;)Landroid/content/Context;

    move-result-object p2

    const v0, 0x7f0607a7

    invoke-static {p2, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    const p2, 0x7f0a066d

    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    check-cast p1, Lcom/sma/smartv3/view/ImageViewRound;

    const p3, 0x7f0813c4

    invoke-static {p2, p3}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p3

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$OXO1;->XO0O10(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;I)V

    return-void
.end method
