.class public final Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/CoachingsActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleCoaching;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 CoachingsActivity.kt\ncom/sma/smartv3/ui/me/CoachingsActivity\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n89#2:100\n132#3,4:101\n88#4:105\n87#5:106\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 CoachingsActivity.kt\ncom/sma/smartv3/ui/me/CoachingsActivity\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n89#2:100\n132#3,4:101\n88#4:105\n87#5:106\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/smartv3/ui/me/CoachingsActivity;

.field public final synthetic IO:Landroid/widget/ImageView;

.field public final synthetic iX1O1:I


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;I)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;->IO:Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;->I1:Lcom/sma/smartv3/ui/me/CoachingsActivity;

    iput p3, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;->iX1O1:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;->IO:Landroid/widget/ImageView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;->I1:Lcom/sma/smartv3/ui/me/CoachingsActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->access$getMCoachingIds$p(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Lcom/szabh/smable3/entity/BleCoachingIds;

    move-result-object p1

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleCoachingIds;->getMIds()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;->I1:Lcom/sma/smartv3/ui/me/CoachingsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->access$getMList(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;->iX1O1:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;->IO:Landroid/widget/ImageView;

    const v0, 0x7f080ffb

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
