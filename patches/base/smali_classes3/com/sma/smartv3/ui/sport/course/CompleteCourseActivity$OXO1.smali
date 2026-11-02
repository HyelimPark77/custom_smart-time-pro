.class public final Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity$OXO1;
.super Lcom/bumptech/glide/request/target/SimpleTarget;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/request/target/SimpleTarget<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity$OXO1;->IO:Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity;

    invoke-direct {p0}, Lcom/bumptech/glide/request/target/SimpleTarget;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/request/transition/Transition<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    const-string p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity$OXO1;->IO:Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {p2, v0, v1}, Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity;->setLayoutHeight(II)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity$OXO1;->IO:Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity;->getMRoundPicImage()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/CompleteCourseActivity$OXO1;->OXO1(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V

    return-void
.end method
