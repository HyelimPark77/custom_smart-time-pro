.class public final Lcom/sma/smartv3/util/GifUtils$play$1$onResourceReady$1;
.super Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/GifUtils$play$1;->OXO1(Lcom/bumptech/glide/load/resource/gif/GifDrawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $listener:Lcom/sma/smartv3/util/GifUtils$OXO1;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/GifUtils$OXO1;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/GifUtils$play$1$onResourceReady$1;->$listener:Lcom/sma/smartv3/util/GifUtils$OXO1;

    invoke-direct {p0}, Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iget-object p1, p0, Lcom/sma/smartv3/util/GifUtils$play$1$onResourceReady$1;->$listener:Lcom/sma/smartv3/util/GifUtils$OXO1;

    invoke-interface {p1}, Lcom/sma/smartv3/util/GifUtils$OXO1;->OXO1()V

    return-void
.end method
